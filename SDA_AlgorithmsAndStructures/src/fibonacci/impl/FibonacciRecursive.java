package fibonacci.impl;

import fibonacci.Fibonacci;

/**
 * Created by Miki on 22.02.2017.
 */
public class FibonacciRecursive implements Fibonacci {

    public enum FibonacciMethodEnum {
        RECURSIVE,
        ITERATION;
    }

    public long getN(int number) {
        long value = 0;
        if (number < 0)
        {
            value = -1;
        }
        if (number == 1)
        {
            value = 1;
        }
        if (number > 1)
        {
            value = getN(number - 1) + getN(number - 2);
        }
        return value;
    }


}
