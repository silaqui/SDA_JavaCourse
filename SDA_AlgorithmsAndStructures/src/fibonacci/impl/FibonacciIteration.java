package fibonacci.impl;

import fibonacci.Fibonacci;

/**
 * Created by Miki on 22.02.2017.
 */
public class FibonacciIteration implements Fibonacci {

    public long getN(int number) {
        int valueLeft = 0;
        int valueRitgh = 1;
        int temp = 0;
        for (int i = 0; i < number; i++)
        {
            temp = valueLeft;
            valueLeft = valueRitgh;
            valueRitgh += temp;
        }
        return valueLeft;
    }
}
