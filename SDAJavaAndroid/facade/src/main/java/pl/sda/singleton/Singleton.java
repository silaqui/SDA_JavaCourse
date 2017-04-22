package pl.sda.singleton;

/**
 * Created by Miki on 25.02.2017.
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

    public String getName (){
        return "Singleton";
    }
}
