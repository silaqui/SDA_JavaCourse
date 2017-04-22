package pl.sda.exception;

/**
 * Created by Miki on 23.02.2017.
 */
public class Calculator {

    public static int calculator(int a, int b) throws DivideByZeroExcetion {
        if (b == 0)
        {
            throw new DivideByZeroExcetion("Nie dziel przez zero");
        }
        return a / b;
    }

}
