package pl.sda.observer;


public class Observer {
    public void react(int val) {
        System.out.println("Value " + val + " changed to zero");
    }
}
