package fibonaci.impl;

/**
 * Created by Miki on 27.02.2017.
 */
public class FibonacciMaven {

    public static long getN(int number) {
        long valueLeft = 0;
        long valueRigth = 1;
        long temp = 0;
        for (long i = 0; i < number; i++)
        {
            temp = valueLeft;
            valueLeft = valueRigth;
            valueRigth += temp;
        }
        return valueLeft;
    }
}

