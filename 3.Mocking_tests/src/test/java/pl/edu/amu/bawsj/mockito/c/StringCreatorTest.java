package pl.edu.amu.bawsj.mockito.c;

import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;

public class StringCreatorTest
{

    @Test
    public void shouldPerformSomeCalculationCorrectly()
    {
        StringCreator creator = mock(StringCreator.class);
        when(creator.create()).thenReturn("Hi there\nHithere");
        Assert.assertEquals(creator.create(),"Hi there\nHithere");


    }
}