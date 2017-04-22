package pl.sda.observer;

import pl.sda.facade.SortFacade;

import java.util.Arrays;

/**
 * Created by Miki on 25.02.2017.
 */
public class Main {

    public static void main(String[] args) {

    int[] tab = new int[]{1, 43, -3, -23, 201};

    Observer observer = new Observer();
    SortFacade sort2 = new SortFacade(observer);

    int[] result2 = sort2.sortUsingCountSort(tab);
    System.out.println(Arrays.toString(result2));


    }
}
