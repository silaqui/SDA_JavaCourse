package algorytmy.structures;

/**
 * Created by Miki on 16.02.2017.
 */
public class MyLinkedList implements MyListInterface {

    private int value;
    private MyLinkedList next;

    public MyLinkedList() {
    }

    private MyLinkedList(int value) {
        this.value = value;
    }

    private MyLinkedList getLast() {
        MyLinkedList myLinkedList = this;
        while (myLinkedList.next != null)
        {
            myLinkedList = myLinkedList.next;
        }
        return myLinkedList;
    }

    @Override
    public void add(int value) {
        MyLinkedList myLinkedList = getLast();
        MyLinkedList tmpObject = new MyLinkedList();
        tmpObject.value = value;
        myLinkedList.next = tmpObject;
    }

    private boolean checkIndex(int index) {
        return index >= 0 && index < getSize();
    }

    //No excetion coverage
    @Override
    public void add(int value, int index) {
        if (checkIndex(index))
        {
            MyLinkedList myLinkedList = getElement(index - 1);
            MyLinkedList newElementInList = new MyLinkedList(value);
            newElementInList.next = myLinkedList.next;
            myLinkedList.next = newElementInList;
        }
    }

    @Override
    public int get(int index) {
        MyLinkedList myLinkedList = this;
        for (int i = 0; i <= index; i++)
        {
            if (myLinkedList.next == null)
            {
                System.out.println("Wrong index");
                return 0;
            }
            myLinkedList = myLinkedList.next;
        }
        return myLinkedList.value;
    }

    private MyLinkedList getElement(int index) {
        MyLinkedList myLinkedList = this;
        if (index < -1)
        {
            return null;
        }
        for (int i = 0; i <= index; i++)
        {
            if (myLinkedList.next == null)
            {
                return null;
            }
            myLinkedList = myLinkedList.next;
        }
        return myLinkedList;
    }

    @Override
    public void put(int value, int index) {
        MyLinkedList element = getElement(index);
        if (element != null)
        {
            element.value = value;
        }
    }

    @Override
    public void addAll(MyListInterface myList) {
        for (int i = 0; i < myList.getSize(); i++)
        {
            this.add(myList.get(i));
        }
    }

    @Override
    public void addAll(MyListInterface myList, int index) {
        for (int i = 0; i < myList.getSize(); i++)
        {
            this.add(myList.get(i), index + i);
        }
    }

    @Override
    public void delete(int index) {
        if (index < getSize())
        {
            MyLinkedList previousElement = getElement(index - 1);
            MyLinkedList delitingElement = getElement(index);
            previousElement.next = delitingElement.next;
            delitingElement.next = null;
        }
    }

    @Override
    public MyListInterface clone() {
        MyListInterface myClonedList = new MyLinkedList();
        for (int i = 0; i < this.getSize(); i++)
        {
            myClonedList.add(this.get(i));
        }
        return myClonedList;
    }

    @Override
    public int getSize() {
        int counter = 0;
        MyLinkedList myLinkedList = this;
        while (myLinkedList.next != null)
        {
            counter++;
            myLinkedList = myLinkedList.next;
        }
        return counter;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("[");
        for (int i = 0; i < getSize(); i++)
        {
            stringBuilder.append(this.get(i));
            if (i != getSize() - 1)
            {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
