package pl.edu.amu.bawsj.junit;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

//import static org.hamcrest.Matcher.*;
//import static org.hamcrest.Matcher.containsString;
//import static org.hamcrest.CoreMatchers.*;
//import static org.junit.matchers.JUnitMatchers.*;
//import static org.hamcrest.CoreMatchers.allOf;
//import static org.hamcrest.CoreMatchers.anyOf;
//import static org.hamcrest.CoreMatchers.both;
//import static org.hamcrest.CoreMatchers.containsString;
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.everyItem;
//import static org.hamcrest.CoreMatchers.hasItems;
//import static org.hamcrest.CoreMatchers.not;
//import static org.hamcrest.CoreMatchers.sameInstance;
//import static org.hamcrest.CoreMatchers.startsWith;



import org.junit.*;
import org.junit.Assert;

public class FizzBuzzTest
{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    public String[] rs = new String[101];

    @Before
    public void setUpStreams() {

        System.setOut(new PrintStream(outContent));
        new FizzBuzz().go(rs);
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }


    @Test
    public void shouldPrintOutput() {

        Assert.assertNotNull("funkcja nic nie wypisuje",outContent);
    }

    @Test
    public void shouldPrintFizzAndBuzz(){

        for (int i=1; i<=100; i++){
            if( i % 3 == 0 && i % 5 != 0 )
            {
                Assert.assertEquals("Funkcja powinna zwracać Fizz dla liczb podzielnych przez 3",rs[i],"Fizz");
            }
            if( i % 5 == 0 && i % 3 != 0 )
            {
                Assert.assertEquals("Funkcja powinna zwracać Buzz dla liczb podzielnych przez 5",rs[i],"Buzz");
            }
            if( i % 5 == 0 && i % 3 == 0 )
            {
                Assert.assertEquals("Funkcja powinna zwracać FizzBuzz dla liczb podzielnych przez 3 & 5",rs[i],"FizzBuzz");
            }

        }
    }

        @Test
        public void shouldPrintNumbers() {

            for (int i=1; i<=100; i++){
                if( i % 3 != 0 && i % 5 != 0 )
                {
                    Assert.assertEquals("Funkcja powinna zwracać wartość liczby jeśli nie jest podzielna przez 3 lub 5 ",rs[i],rs[i]);
                }

        }



    }





}