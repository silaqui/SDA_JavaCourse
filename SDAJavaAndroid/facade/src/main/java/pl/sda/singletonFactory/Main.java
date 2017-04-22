package pl.sda.singletonFactory;

import pl.sda.singleton.Singleton;
import pl.sda.sort.Sort;
import pl.sda.sort.factory.SortTypeEnum;

import java.util.Arrays;

/**
 * Created by Miki on 25.02.2017.
 */
public class Main {

    public static void main(String[] args) {

        SingletonSortFactory singleton = SingletonSortFactory.getInstance();

        Sort sorterB = singleton.produce(SortTypeEnum.BUBBLE);
        Sort sorterC = singleton.produce(SortTypeEnum.COUNT);
        Sort sorterI = singleton.produce(SortTypeEnum.INSERT);

        int[]array = new int[] {12,2,3};

        System.out.println(Arrays.toString(sorterB.sort(array)));

    }
}
