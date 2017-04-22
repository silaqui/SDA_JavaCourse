package test.algorytmy.structures;

import algorytmy.structures.queue.FIFOQueue;
import algorytmy.structures.queue.Queue;
import algorytmy.structures.queue.QueueExcetion;

/**
 * Created by Miki on 18.02.2017.
 */
public class FIFOQueueTests {

    public static void main(String[] args) {

        Queue queue = new FIFOQueue();

        try
        {
            queue.pop();
        } catch (QueueExcetion queueExcetion)
        {
            queueExcetion.printStackTrace();
            try
            {
                Thread.sleep(100);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        System.out.println("Dodano 1, 2, 3, 4, 5 ");
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out.println(queue.toString());

        System.out.println("usunieto 1 element");
        try
        {
            queue.pop();
        } catch (QueueExcetion queueExcetion)
        {
            queueExcetion.printStackTrace();
        }
        System.out.println(queue.toString());

        System.out.println("klonowanie");
        Queue clonedQueue = queue.clone();
        System.out.println(queue.toString());
        System.out.println(clonedQueue.toString());

        System.out.println("dodwanie 2 el do pierwszej ");
        queue.push(6);
        queue.push(7);
        System.out.println(queue.toString());
        System.out.println(clonedQueue.toString());




    }
}
