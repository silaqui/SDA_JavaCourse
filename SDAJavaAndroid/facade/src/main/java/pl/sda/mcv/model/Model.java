package pl.sda.mcv.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miki on 25.02.2017.
 */
public class Model{

    public static List<Long> arrayOfValues = new ArrayList<Long>();

    public static List<Long> getValues() {
        return arrayOfValues;
    }

    public static void addValue (long value){
        arrayOfValues.add(value);
    }
}