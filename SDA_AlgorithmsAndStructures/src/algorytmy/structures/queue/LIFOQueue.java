package algorytmy.structures.queue;

/**
 * Created by Miki on 18.02.2017.
 */
public class LIFOQueue extends AbstractQueue {

    public LIFOQueue() {
    }

    private LIFOQueue(int value) {
        super(value);
    }

    @Override
    public void push(int value) {
        LIFOQueue newElement = new LIFOQueue(value);
        newElement.next = this.next;
        this.next = newElement;
    }

    public AbstractQueue getInstance(){
        return new LIFOQueue();
    }

    public AbstractQueue getInstance(int value){
        return new LIFOQueue(value);
    }

}
