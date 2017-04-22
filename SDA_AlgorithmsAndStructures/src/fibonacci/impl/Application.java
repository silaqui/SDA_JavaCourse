package fibonacci.impl;


import fibonacci.Fibonacci;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miki on 22.02.2017.
 */
public class Application
{

    public static void main(String[] args) {

        Fibonacci fibonacciRecursive = FibonacciFactory.produce(FibonacciMethodEnum.RECURSIVE);
        Fibonacci fibonacciIteration = FibonacciFactory.produce(FibonacciMethodEnum.ITERATION);

        List<Fibonacci> listaFib = new ArrayList<>();
        listaFib.add(fibonacciIteration);
        listaFib.add(fibonacciRecursive);

        for (Fibonacci fib: listaFib)
        {
            System.out.println(fib.getN(4));
        }


    }


}
