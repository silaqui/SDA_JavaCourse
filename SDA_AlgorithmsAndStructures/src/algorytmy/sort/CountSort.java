package algorytmy.sort;

import algorytmy.sort.impl.Sort;

import java.util.Arrays;

import static algorytmy.sort.SortUtils.maxOfArray;
import static algorytmy.sort.SortUtils.minOfArray;

/**
 * Created by Miki on 14.02.2017.
 */
public class CountSort implements Sort {

    public static void main(String[] args) {

        CountSort countSort = new CountSort();

        int[] array = new int[]{1,2,3,4,12,-2,-12};

        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(countSort.ascSort(array)));
        System.out.println(Arrays.toString(countSort.descSort(array)));


    }

    public int[] ascSort(int[] array) {

        int max = SortUtils.maxOfArray(array);
        int min = SortUtils.minOfArray(array);
        int range = max + 1 - min;
        int[] rangeArray = new int[range];

        for (int i = 0; i < array.length; i++)
        {
            rangeArray[array[i] - min]++;
        }
        int index = 0;
        for (int i = 0; i < rangeArray.length; i++)
        {
            for (int j = 0; j < rangeArray[i]; j++)
            {
                array[index] = i + min;
                index++;
            }
        }
        return array;
    }

//    !Works only with >0
//    public int[] descSort(int[] array) {
//
//        int max = SortUtils.maxOfArray(array);
//        int min = SortUtils.minOfArray(array);
//        int range = max + 1 - min;
//        int[] rangeArray = new int[range];
//
//        for (int i = 0; i < array.length; i++)
//        {
//            rangeArray[array[i] - min]++;
//        }
//
//        int index = array.length-1;
//        for (int i = 0; i < rangeArray.length; i++)
//        {
//            for (int j = rangeArray[array.length-i-1]; j >0; j--)
//            {
//                array[index] = i + min;
//                if (index>0) index--;
//            }
//        }
//        return array;
//    }

    public int[] descSort (int[] array )
    {
        int[] tempArray = ascSort(array);
        int[] result = new int[tempArray.length];
        for (int i = 0; i < tempArray.length; i++)
        {
            result [i] = tempArray[tempArray.length-i-1];
        }
        return result;
    }


}
