package pl.sda.adapter;

/**
 * Created by Miki on 27.02.2017.
 */
public class PersonToCarAdapter implements Car {

    private Person person;

    public PersonToCarAdapter(Person person) {
        this.person = person;
    }

    @Override
    public void drive() {
        person.move();

    }

    @Override
    public void horn() {
        person.say();
    }
}
