package pl.sda.singletonFactory;

import pl.sda.sort.factory.SortFactory;

/**
 * Created by Miki on 25.02.2017.
 */
public class SingletonSortFactory extends SortFactory{

    private static SingletonSortFactory instance = new SingletonSortFactory();

    private SingletonSortFactory() {
    }

    public static SingletonSortFactory getInstance() {
        return instance;
    }

}
