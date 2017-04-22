package algorytmy.structures.queue;

import java.lang.reflect.Constructor;

/**
 * Created by Miki on 18.02.2017.
 */
public abstract class AbstractQueue implements Queue {

    protected int value;
    protected AbstractQueue next;

    public AbstractQueue() {
    }

    protected AbstractQueue(int value) {
        this.value = value;
    }

    @Override
    public void push(int value) {    }

    @Override
    public int pop() throws QueueExcetion {
        if (this.next != null)
        {
            AbstractQueue removedElement = this.next;
            this.next = removedElement.next;
            removedElement.next = null;
            return removedElement.value;
        }
        System.out.println("Queue empty");
        throw new QueueExcetion("This queue is already empty");
    }

    @Override
    public Queue clone() {
        AbstractQueue clonedQueue = null;
        clonedQueue = this.getInstance();
        AbstractQueue returnedQueue = clonedQueue;
        AbstractQueue queue = this.next;

        while (queue != null)
        {
            clonedQueue.next = this.getInstance(queue.value);
            queue = queue.next;
            clonedQueue = clonedQueue.next;
        }

        return returnedQueue;
    }

    protected abstract AbstractQueue getInstance();
    protected abstract AbstractQueue getInstance(int value);

    @Override
    public String toString() {
        AbstractQueue queue = this.next;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        while (queue != null)
        {
            stringBuilder.append(queue.value);

            if (queue.next != null)
            {
                stringBuilder.append(", ");
            }
            queue = queue.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    protected AbstractQueue getLast() {
        AbstractQueue queue = this;
        while (queue.next != null)
        {
            queue = queue.next;
        }
        return queue;
    }


}
