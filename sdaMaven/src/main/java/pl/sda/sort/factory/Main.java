package pl.sda.sort.factory;

import pl.sda.sort.impl.Sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Miki on 23.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Sort bubbleSorter = new SortFactory().produce(SortEnum.BUBBLE);

        int[] array = new int[]{1, 3, 2, 5, 4, 7, 6};
        array = bubbleSorter.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println();

        Planets earth = Planets.EARTH;
        System.out.println(earth.getCircumference() );
    }

}
