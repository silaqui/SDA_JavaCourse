package pl.sda.mcv.controller;

import pl.sda.mcv.model.Model;
import pl.sda.mcv.model.ModelFacade;

import java.util.List;
import static fibonaci.impl.FibonacciMaven.getN;

/**
 * Created by Miki on 25.02.2017.
 */
public class Controller {

    public static long getFibValue(long n) {
        long value = getN((int)n);

        ModelFacade.addValue(value);
        return value;
    }

    public static double average (){

        List<Long> array = ModelFacade.getValues();
        double avr = 0;
        double sum = 0;
        for (long val:array)
        {
            sum+=val;
        }
        avr = sum/array.size();
        return avr;
    }

}
