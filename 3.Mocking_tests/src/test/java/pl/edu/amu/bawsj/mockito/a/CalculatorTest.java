package pl.edu.amu.bawsj.mockito.a;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.util.List;


public class CalculatorTest {

    @Test
    public void testCalculator(){

        RandomDataProvider dataProvider = new RandomDataProvider( 100 );
        double x = dataProvider.get();
//        Calculator calculator = new Calculator( dataProvider );
        Calculator calculator = mock(Calculator.class);
        when(calculator.calculate()).thenReturn(dataProvider.get()*dataProvider.get());
        Assert.assertEquals(calculator.calculate(),dataProvider.get()*dataProvider.get(),1);

    }



}
