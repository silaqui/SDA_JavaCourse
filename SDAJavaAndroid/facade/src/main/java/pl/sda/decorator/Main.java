package pl.sda.decorator;

import pl.sda.sort.Sort;
import pl.sda.sort.impl.BubbleSort;
import sun.java2d.pipe.BufferedMaskBlit;

import java.util.Arrays;

/**
 * Created by Miki on 27.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 99, 5};

        Sort sort = new SortDecoratorWithRevers(new BubbleSort());

        int[] result = sort.sort(array);

        System.out.println(Arrays.toString(result));


    }

}
