package pl.sda.decorator;

import pl.sda.sort.Sort;

/**
 * Created by Miki on 27.02.2017.
 */
public class SortDecoratorWithRevers implements Sort {

    private Sort sort;

    public SortDecoratorWithRevers(Sort sort) {
        this.sort = sort;
    }

    @Override
    public int[] sort(int[] arrayToSort) {
        int[] result = sort.sort(arrayToSort);
        int[] reversedResult = new int[arrayToSort.length];

        for (int i = 0; i < result.length; i++)
        {

            reversedResult[i] = result[result.length - 1 - i];
        }
        return reversedResult;
    }

}
