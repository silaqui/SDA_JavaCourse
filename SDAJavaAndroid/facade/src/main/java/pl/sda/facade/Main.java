package pl.sda.facade;

import pl.sda.observer.Observer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] tab = new int[] {553,55,1,67,1,77,0};
        SortFacade sort = new SortFacade();
        int[] result1 = sort.sortThroughFacade(tab);
        System.out.println(Arrays.toString(result1));
    }
}
