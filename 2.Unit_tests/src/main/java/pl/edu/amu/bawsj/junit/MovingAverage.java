package pl.edu.amu.bawsj.junit;

import java.util.ArrayList;
import java.util.List;

public class MovingAverage
{
    public List<Double> numbers = new ArrayList<Double>();
    int windowSize;

    MovingAverage( int _windowSize )
    {
        if(_windowSize<0){
            throw new IllegalArgumentException("Nieprawidłowa wartość");
        }

        windowSize = _windowSize;
    }

    public void push( double val )
    {
        numbers.add(val);

    }

    public double getAvg()
    {
        double average = 0 ;
        for (int i = numbers.size()-windowSize; i<numbers.size(); i++ )
            average += numbers.get(i);
        average=average/windowSize;
        return average;
    }

    public static void main( String[] args )
    {
        MovingAverage ma = new MovingAverage(5);
        for (int i=20; i<=100; i++) ma.push(i);

        System.out.println(ma.getAvg());

    }
}


