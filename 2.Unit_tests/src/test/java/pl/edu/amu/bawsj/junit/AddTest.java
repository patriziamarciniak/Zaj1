package pl.edu.amu.bawsj.junit;

import org.junit.Assert;
import org.junit.*;

public class AddTest
{

    Add add = new Add();
    @Test
    public void shouldAdd(){

        Assert.assertEquals("dodawanie dodatnich liczb niepoprawne",add.go(1,2),3);
        Assert.assertEquals("dodawanie ujemnych liczb niepoprawne",add.go(-12,-5),-17);
    }

//    @Test(expected = IllegalArgumentException.class)
//    public void shouldThrowIllegalArgumentException(){
//      add.go(0.5,0.5);
//    }

}