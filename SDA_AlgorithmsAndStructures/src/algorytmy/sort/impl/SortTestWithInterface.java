package algorytmy.sort.impl;

import algorytmy.sort.BubleSort;
import algorytmy.sort.CountSort;
import algorytmy.sort.SelectionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by Miki on 22.02.2017.
 */
public class SortTestWithInterface {
    public static void main(String[] args) {

//        int[] array = new int[]{-1, 4, 2, 6, 3, 1, 2, 4, 12, -1, 23, -10};
//        System.out.println(Arrays.toString(array));

        int[] listToSort = new int [20];
        for (int i = 0; i < 20 ; i++)
        {
            Random rand = new Random();
            listToSort[i] = rand.nextInt(10000);
        }

        Sort bubbleSort = new BubleSort();
        Sort countSort = new CountSort();
        Sort selectionSort = new SelectionSort();

        List<Sort> SorterList = new ArrayList<>();
        SorterList.add(bubbleSort);
        SorterList.add(countSort);
        SorterList.add(selectionSort);

        List<int[]> listOfresults = new ArrayList<>();

        for(Sort sorter : SorterList)
        {
            listOfresults.add(sorter.ascSort(listToSort));
        }
        for (int[]result:listOfresults){
            System.out.println(Arrays.toString(result));
        }



//        listOfresults.add(new BubleSort().ascSort(array));
//        System.out.println(Arrays.toString(listOfresults.get(0)));
//
//        int[] sorted1 = new BubleSort().ascSort(array);
//        System.out.println("Buble sort \t\t" + Arrays.toString(sorted1));
//
//        int[] sorted2 = new CountSort().ascSort(array);
//        System.out.println("Count sort \t\t" + Arrays.toString(sorted2));
//
//        int[] sorted3 = new SelectionSort().ascSort(array);
//        System.out.println("Selection sort \t" + Arrays.toString(sorted3));
//
//        int[] sorted4 = new BubleSort().descSort(array);
//        System.out.println("Buble desc sort \t\t" + Arrays.toString(sorted4));
//
//        int[] sorted5 = new CountSort().descSort(array);
//        System.out.println("Count desc sort \t\t" + Arrays.toString(sorted5));
//
//        int[] sorted6 = new SelectionSort().descSort(array);
//        System.out.println("Selection desc sort \t" + Arrays.toString(sorted6));

    }
}
