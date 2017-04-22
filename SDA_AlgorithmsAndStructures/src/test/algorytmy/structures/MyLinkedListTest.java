package test.algorytmy.structures;

import algorytmy.structures.MyLinkedList;

/**
 * Created by Miki on 16.02.2017.
 */
public class MyLinkedListTest {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(0);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);

        System.out.println(myLinkedList.toString());

        System.out.println("dodanie 100 na index 0");
        myLinkedList.add(100,0);

        System.out.println(myLinkedList.toString());

        System.out.println("dodanie 999 na index 4");
        myLinkedList.put(999,4);

        System.out.println(myLinkedList.toString());
        System.out.println();

        System.out.println("Klonowanie");
        MyLinkedList clonedList = (MyLinkedList) myLinkedList.clone();

        System.out.println(myLinkedList.toString());
        System.out.println(clonedList);
        System.out.println();

        System.out.println("dodanie 123 clonedList \n usuniecie poz 2 w myLinkedList");
        clonedList.add(123);
        myLinkedList.delete(2);

        System.out.println(myLinkedList.toString());
        System.out.println(clonedList.toString());
        System.out.println();

        System.out.println("Dodanie na koniec orginalnej listy calej sklonowanej listy \n usuniecie poz 0 ze sklonowanej");
        myLinkedList.addAll(clonedList);
        clonedList.delete(0);

        System.out.println(myLinkedList.toString());
        System.out.println(clonedList.toString());
        System.out.println();

        System.out.println("ustawianie klonowanej listy na 999 put'ami");

        clonedList.put(999,0);
        clonedList.put(999,1);
        clonedList.put(999,2);
        clonedList.put(999,3);
        clonedList.put(999,4);

        System.out.println(myLinkedList.toString());
        System.out.println(clonedList.toString());
        System.out.println();

        System.out.println();

        System.out.println("dodanie listy na pozycje ");

        myLinkedList.addAll(clonedList,9);

        System.out.println(myLinkedList.toString());
        System.out.println(clonedList.toString());

        System.out.println("tesotwanie add");

        clonedList.add(1,0);
        clonedList.add(1,2);
        clonedList.add(1,4);
        clonedList.add(1,6);
        clonedList.add(1,8);
        clonedList.add(1,10);

        System.out.println(clonedList.toString());

        System.out.println("dodawanie do orginalnej listy sklonowanej na koniec ");

        myLinkedList.addAll(clonedList);

        System.out.println();
        System.out.println(myLinkedList.toString());
        System.out.println(clonedList.toString());
        System.out.println();











    }
}
