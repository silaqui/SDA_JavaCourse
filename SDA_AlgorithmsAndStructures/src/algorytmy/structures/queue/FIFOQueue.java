package algorytmy.structures.queue;

/**
 * Created by Miki on 18.02.2017.
 */
public class FIFOQueue extends AbstractQueue {

    public FIFOQueue() {
    }

    private FIFOQueue(int value) {
        super(value);
    }

    @Override
    public void push(int value) {
        AbstractQueue myQueue = getLast();
        myQueue.next = new FIFOQueue(value);
    }

    public AbstractQueue getInstance(){
        return new FIFOQueue();
    }

    public AbstractQueue getInstance(int value){
        return new FIFOQueue(value);
    }

}

