package pl.sda.adapter;

/**
 * Created by Miki on 27.02.2017.
 */
public class CarToPersonAdapter implements Person{
    private Car car;

    public CarToPersonAdapter(Car car)
    {
        this.car = car;
    }

    @Override
    public void move() {
        car.drive();
    }

    @Override
    public void say() {
        car.horn();
    }
}
