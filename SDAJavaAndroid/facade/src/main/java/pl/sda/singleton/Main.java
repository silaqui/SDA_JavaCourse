package pl.sda.singleton;

/**
 * Created by Miki on 25.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getName());





    }
}
