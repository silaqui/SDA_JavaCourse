package algorytmy.structures;

import java.util.Arrays;

/**
 * Created by Miki on 15.02.2017.
 */
public class MyList implements MyListInterface {

    private int[] array;
    private int size;                       //Hold index of last empty element
    private final int INITIAL_SIZE = 10;


    public MyList() {
        this.array = new int[INITIAL_SIZE];
        this.size = 0;
    }

    public int get(int index) {
        if (index < 0 || index > size)
        {
            System.out.println("Wrong index");
            return 0;
        }
        return this.array[index];
    }

    public void add(int value) {
        if (this.size >= this.array.length)
        {
            doubleCapacity();
        }
        this.array[size] = value;
        this.size++;
    }

    public void add(int value, int index) {
        if (checkIndex(index))
        {
            if (this.size >= this.array.length)
            {
                doubleCapacity();
            }
            for (int i = size; i > index; i--)
            {
                this.array[i] = this.array[i - 1];
            }
            this.size++;
            this.array[index] = value;
        }
    }

    public void put(int value, int index) {
        if (checkIndex(index))
        {
            this.array[index] = value;
        }
    }

    public boolean checkIndex(int index) {
        return (index >= 0 && index < this.size);
    }

    private void doubleCapacity() {
        int[] tmpArray = new int[2 * this.array.length];
        this.array = rewrite(tmpArray);
    }

    private int[] rewrite(int[] tmpArray) {
        for (int i = 0; i < this.array.length; i++)
        {
            tmpArray[i] = this.array[i];
        }
        return tmpArray;
    }

    private void swap(int index1, int index2) {
        int tmp = this.array[index1];
        this.array[index1] = this.array[index2];
        this.array[index2] = tmp;
    }

    public MyListInterface clone() {
        MyList myList = new MyList();
        myList.array = rewrite(new int[(this.array.length)]);
        myList.size = this.getSize();
        return myList;
    }

    public void delete(int index) {
        if (checkIndex(index))
        {
            for (int i = index; i < this.size - 1; i++)
            {
                this.array[i] = this.array[i + 1];
            }
            this.size--;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("[");
        for (int i = 0; i < size; i++)
        {
            stringBuilder.append(array[i]);
            if (i != size - 1)
            {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();

    }

    public void addAll (MyListInterface myList){
        for (int i = 0; i < myList.getSize() ; i++)
        {
            this.add(myList.get(i));
        }
    }

    public void addAll (MyListInterface myList, int index){
        for (int i = 0; i < myList.getSize() ; i++)
        {
            add(myList.get(i),index+i);
        }
    }
}
