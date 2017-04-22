package pl.sda.sort.factory;

/**
 * Created by Miki on 23.02.2017.
 */
public enum Planets {
    EARTH(6371),
    MARS(3390);

    int radius;

    Planets (int radius)
    {
        this.radius = radius;
    }

    public float getCircumference(){
        return 2*radius*3.14f;
    }
}
