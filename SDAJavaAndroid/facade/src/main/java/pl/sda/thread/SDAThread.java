package pl.sda.thread;

/**
 * Created by Miki on 27.02.2017.
 */
public class SDAThread implements Runnable {

    private int number;

    public SDAThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        while (true)
        {
            try
            {
                Thread.sleep(1500);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("Wątek nr: " + number);
        }
    }

}
