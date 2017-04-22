package algorytmy.sort;

import algorytmy.sort.impl.Sort;

import static java.lang.StrictMath.abs;

/**
 * Created by Miki on 14.02.2017.
 */
public class SortUtils  {

    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static void graphPrint(int[] array, int step) {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
            char c = 'o';
            if (array[i] >= 0)
            {
                c = '+';
            } else
            {
                c = '-';
            }
            for (int j = 0; j < abs(array[i]); j += step)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static int maxOfArray (int[] array){
        int max = array[0];
        for (int i = 1; i < array.length ; i++)
        {
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    public static int minOfArray (int[] array){
        int min = array[0];
        for (int i = 1; i < array.length ; i++)
        {
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }


}
