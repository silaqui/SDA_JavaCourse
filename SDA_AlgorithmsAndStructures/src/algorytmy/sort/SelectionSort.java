package algorytmy.sort;

import algorytmy.sort.impl.Sort;

import java.util.Arrays;

import static algorytmy.sort.SortUtils.swap;

/**
 * Created by Miki on 14.02.2017.
 */
public class SelectionSort implements Sort {

    public static void main(String[] args) {

        SelectionSort insertSort = new SelectionSort();

        int[] array = new int[]{-1, 4, 2, 6, 3, 1, 2, 4, 12, -1, 23, -10};

        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(insertSort.ascSort(array)));

        System.out.println(Arrays.toString(insertSort.descSort(array)));


    }

    public int[] ascSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++)
        {
            int indexOfMax = 0;
            for (int j = 0; j < array.length - i; j++)
            {
                if (array[indexOfMax] < array[j])
                {
                    indexOfMax = j;
                }
            }
            swap(array, indexOfMax, array.length - 1 - i);
        }
        return array;
    }

    public int[] descSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++)
        {
            int indexOfMin = 0;
            for (int j = 1; j < array.length - i; j++)
            {
                if (array[indexOfMin] > array[j])
                {
                    indexOfMin = j;
                }
            }
            swap(array, indexOfMin, array.length - 1 - i);
        }
        return array;
    }
}
