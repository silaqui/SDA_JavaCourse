package pl.sda.sort.factory;

import pl.sda.sort.impl.BubbleSort;
import pl.sda.sort.impl.CountSort;
import pl.sda.sort.impl.InsertSort;
import pl.sda.sort.impl.Sort;

/**
 * Created by Miki on 23.02.2017.
 */
public class SortFactory {

    public static Sort produce(SortEnum type) {
        Sort result = null;
        if (SortEnum.BUBBLE.equals(type))
        {
            return new BubbleSort();
        }
        if (SortEnum.COUNT.equals(type))
        {
            return new CountSort();
        }
        if (SortEnum.INSERT.equals(type))
        {
            return new InsertSort();
        }
        return null;
    }

}


