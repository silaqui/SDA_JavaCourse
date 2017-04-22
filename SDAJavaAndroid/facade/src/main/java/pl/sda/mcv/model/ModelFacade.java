package pl.sda.mcv.model;

import java.util.List;

/**
 * Created by Miki on 27.02.2017.
 */
public class ModelFacade {

    public static List<Long> getValues() {
        return Model.getValues();
    }

    public static void addValue (long value){
        Model.addValue(value);
    }
}


