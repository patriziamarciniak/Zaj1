package pl.edu.amu.bawsj.mockito.d;
import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;

public class ResultProcessorTest
{

    @Test
    public void shouldGiveResult()
    {
        ResultProcessor mockedResult = mock(ResultProcessor.class);
        UnpredictableResultProvider result = new UnpredictableResultProvider();
        UnpredictableResultProvider result2 = new UnpredictableResultProvider();
        String result3 = result.provide()+" "+ result2.provide();

        when(mockedResult.provide()).thenReturn(result3);
        Assert.assertEquals(mockedResult.provide(),result3);

    }
}