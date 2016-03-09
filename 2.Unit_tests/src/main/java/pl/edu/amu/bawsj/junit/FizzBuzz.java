package pl.edu.amu.bawsj.junit;

public class FizzBuzz
{

    public static void main( String[] args )
    {
        String[] resultArray = new String[101];
        new FizzBuzz().go(resultArray);
        for (int i=1; i<=100; i++) {
            System.out.println(resultArray[i]);
        }

    }


    public void go(String[] _resultArray)
    {
        for( int i = 1; i <= 100; i++ )
        {
            String result = "";
            if( i % 3 == 0 )
            {
                result += "Fizz";
            }
            if( i % 5 == 0 )
            {
                result += "Buzz";
            }
            if( result == "" )
            {
                result += i;
            }
            System.out.println( result );
            _resultArray[i]=result;

        }
    }
}
