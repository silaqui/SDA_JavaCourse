package test.algorytmy.structures;

import algorytmy.structures.queue.LIFOQueue;
import algorytmy.structures.queue.Queue;
import algorytmy.structures.queue.QueueExcetion;

/**
 * Created by Miki on 18.02.2017.
 */
public class LIFOQueueTest {

    public static void main(String[] args) throws QueueExcetion {
        System.out.println("LIFO push  test");
        Queue queueLIFO = new LIFOQueue();

        queueLIFO.push(1);
        queueLIFO.push(2);
        queueLIFO.push(3);
        queueLIFO.push(4);

        System.out.println(queueLIFO.toString());

        System.out.println("LIFO pop test");

        System.out.println(queueLIFO.pop());

        System.out.println(queueLIFO.toString());

        System.out.println("klonowanie");
        Queue clonedQueue = queueLIFO.clone();

        System.out.println(queueLIFO.toString());
        System.out.println(clonedQueue.toString());

        System.out.println("1. Dodawanie 3 warotsci \n2. dodawanie 2 wartosci");

        clonedQueue.push(5);
        clonedQueue.push(6);
        queueLIFO.push(7);
        queueLIFO.push(8);
        queueLIFO.push(9);

        System.out.println(queueLIFO.toString());
        System.out.println(clonedQueue.toString());


    }

}
