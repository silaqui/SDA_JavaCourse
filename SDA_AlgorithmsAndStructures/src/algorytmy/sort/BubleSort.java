package algorytmy.sort;

import algorytmy.sort.impl.Sort;

import java.util.Arrays;
import static algorytmy.sort.SortUtils.swap;

/**
 * Created by Miki on 14.02.2017.
 */
public class BubleSort implements Sort{

    public static void main(String[] args) {

        BubleSort bubleSort = new BubleSort();

        int[] array = new int[]{-1, 4, 2, 6, 3, 1, 2, 4, 12, -1, 23, -10};

        System.out.println(Arrays.toString(array));

        int[] sortedArray = bubleSort.ascSort(array);
        System.out.println(Arrays.toString(array));

        sortedArray = bubleSort.descSort(array);
        System.out.println(Arrays.toString(array));

    }

    public int[] ascSort(int[] array) {
        int counter = 0;
        boolean flag = true;
        for (int i = 0 ; i < array.length - 1; i++) {
            flag = true;
            for (int j = 0 ; j <array.length - 1 - i; j++) {
                counter++;
                if (array[j] > array[j + 1]) {
                    SortUtils.swap(array, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return array;
    }

    public int[] descSort(int[] array) {
        int counter = 0;
        boolean flag;
        for (int i = 0 ; i < array.length - 1; i++) {
            flag = true;
            for (int j = 0 ; j <array.length - 1 - i; j++) {
                counter++;
                if (array[j] < array[j + 1]) {
                    SortUtils.swap(array, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return array;
    }



}
