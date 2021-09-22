/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

import java.util.LinkedList;

public class GenericQueue<E> {

    /**
     * Create new LinkedList to support our queue
     */
    private LinkedList<E> list = new LinkedList<E>();

    /**
     * enqueue method to add a new item to the beginning of the LinkedList
     * @param item E
     */
    public void enqueue(E item) {
        list.addFirst(item);
    } // end enqueue

    /**
     * dequeue method to remove the item at the beginning of the LinkedList
     * @return item E
     */
    public E dequeue() {
        return list.removeFirst();
    } // end dequeue

    /**
     * size method to return the number of items in the LinkedList
     * @return size int
     */
    public int size() {
        return list.size();
    } // end size

} // end GenericQueue class