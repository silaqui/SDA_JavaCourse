package pl.sda.exception;

/**
 * Created by Miki on 23.02.2017.
 */
public class DivideByZeroExcetion extends Exception{

    public DivideByZeroExcetion(String s) {
        super (s);
    }

    public DivideByZeroExcetion(String s, Throwable cause) {
        super (s,cause);
    }


}
