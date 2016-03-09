package pl.edu.amu.bawsj.junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class MovingAverageTest
{

    // klasa ma wyliczac srednia z ostatnich N podanych liczb
    // jezeli uzytkownik nie poda zadnej liczby a zechce "srednia" to wyrzucany jest wyjatek: illegalstateexception

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentException(){

        MovingAverage movingAverage = new MovingAverage(-8);
    }
    @Test(expected = IllegalStateException.class)
    public void shouldThrowIllegalStateException(){
        MovingAverage movingAverage = new MovingAverage(1);

        try{
            movingAverage.getAvg();
        }catch(IllegalStateException e){
            throw e;
        }
    }

    @Test
    public void shouldCountAverage(){

        MovingAverage ma1 = new MovingAverage( 2 );
        for( int i = 0; i < 100; i++ )
        {
            ma1.push( i+5 );
        }
        Assert.assertEquals( 2, ma1.getAvg(), (98+5+99+5)/2 );

        MovingAverage ma2 = new MovingAverage( 4 );
        for( int i = 0; i < 5; i++ )
        {
            ma2.push( i );
        }
        Assert.assertEquals( 4, ma2.getAvg(), (1+2+3+4)/4 );

    }

    @Test
    public void shouldSupportBigSetOfData()
    {
        MovingAverage movingAverage = new MovingAverage( 3 );
        for( long i = 0; i < 10000000l; i++ )
        {
            movingAverage.push( 3 );
        }
        Assert.assertEquals( 3, movingAverage.getAvg(), 0.003 );
    }
}
