package test.algorytmy.structures;

import algorytmy.structures.MyList;
import algorytmy.structures.MyListInterface;

/**
 * Created by Miki on 14.02.2017.
 */
public class MyListTests {


    public static void main(String[] args) {


        MyListInterface myList = initMyList();
        MyListInterface myList2 = myList.clone();

        System.out.println(myList.toString());
        System.out.println(myList2.toString());
        System.out.println();

        myList.delete(5);

        System.out.println(myList.toString());
        System.out.println(myList2.toString());
        System.out.println();

        myList.put(9999,0);

        myList.add(0, 5);
        myList.add(0, 5);
        myList.add(0, 5);

        System.out.println(myList.toString());
        System.out.println(myList2.toString());
        System.out.println();

        myList.addAll(myList2,3 );

        System.out.println(myList.toString());
        System.out.println(myList2.toString());
        System.out.println();

    }

    private static MyList initMyList() {
        MyList myList = new MyList();

        myList.add(21);
        myList.add(32);
        myList.add(13);
        myList.add(44);
        myList.add(55);
        myList.add(76);
        myList.add(97);
        myList.add(38);
        myList.add(69);
        myList.add(10);

        return myList;

    }
}


