package fibonacci;

/**
 * Created by Miki on 22.02.2017.
 */
public interface Fibonacci {
    long getN (int n);
}

enum FibonacciMethodEnum {
    RECURSIVE,
    ITERATION;
}