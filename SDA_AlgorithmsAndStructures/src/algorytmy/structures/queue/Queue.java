package algorytmy.structures.queue;

/**
 * Created by Miki on 18.02.2017.
 */
public interface Queue {

    void push (int value);

    int pop () throws QueueExcetion;

    Queue clone ();

}
