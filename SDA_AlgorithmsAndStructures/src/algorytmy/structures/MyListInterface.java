package algorytmy.structures;

/**
 * Created by Miki on 16.02.2017.
 */
public interface MyListInterface {
    void add(int value);

    void add(int value, int index);

    int get(int index);

    void put(int value, int index);

    void addAll(MyListInterface myList);

    void addAll(MyListInterface myList, int index);

    void delete(int index);

    MyListInterface clone();

    int getSize();

}
