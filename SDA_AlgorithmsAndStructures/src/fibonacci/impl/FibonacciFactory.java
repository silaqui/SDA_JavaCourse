package fibonacci.impl;

import fibonacci.Fibonacci;

/**
 * Created by Miki on 23.02.2017.
 */
public class FibonacciFactory {

    public static Fibonacci produce (FibonacciMethodEnum type )
    {
        if (FibonacciMethodEnum.ITERATION.equals(type))
        {
            return new FibonacciIteration();
        }
        if (FibonacciMethodEnum.RECURSIVE.equals(type))
        {
            return new FibonacciRecursive();
        }

        return null;
    }
}
