package pl.sda.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miki on 27.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new CarImpl();
        Person person = new PersonImpl();

        CarToPersonAdapter carToPersonAdapter = new CarToPersonAdapter(car);

        List<Person> personList = new ArrayList<>();

        personList.add(person);
        personList.add(carToPersonAdapter);

        for (Person personFromList : personList)
        {
           personFromList.move();
           personFromList.say();
        }

    }
}
