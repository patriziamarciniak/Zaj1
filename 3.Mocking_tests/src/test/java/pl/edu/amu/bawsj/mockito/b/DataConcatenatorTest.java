package pl.edu.amu.bawsj.mockito.b;
import static org.mockito.Mockito.*;
import org.junit.Assert;
import org.junit.Test;

public class DataConcatenatorTest
{

    @Test
    public void shouldSetDataXXX()
    {
        Data data = new Data( "aaa", "bbb" );
        DataConcatenator dataConcatenator = mock(DataConcatenator.class);
        when(dataConcatenator.concatenate(data)).thenReturn("XXX:XXX");
        Assert.assertEquals(dataConcatenator.concatenate(data),"XXX:XXX");

    }


}