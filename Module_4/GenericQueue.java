import java.util.LinkedList;

public class GenericQueue<E> {

    private LinkedList<E> list = new LinkedList<E>();

    public enqueue(T item) {
        list.addFirst(item);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public int size() {
        return list.size();
    }
}
