package javaAlgorithms.section1.linkedList;

/**
 * linked list implementation of a queue
 */
public class FifoQueue<Item> {
    private Node first; // link to least recently added node
    private Node last; // link to most recently added node - don't need this in a stack
    private int numberOfItems;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return numberOfItems;
    }

    // add item to end of list
    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty())
            first = last;
        else
            oldLast.next = last;
        numberOfItems++;
    }

    // remove item from beginnning of list
    public Item dequeue() {
        Item item = (Item) first.item;
        first = first.next;
        numberOfItems--;
        if (isEmpty()) last = null;
        return item;
    }
}
