package JavaAlgorithms.Section1.LinkedList;

/**
 * Created by hamishdickson on 12/07/15.
 */
public class FifoQueue<Item> {
    private Node first;
    private Node last;
    private int N;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty())
            first = last;
        else
            oldLast.next = last;
        N++;
    }

    public Item dequeue() {
        Item item = (Item) first.item;
        first = first.next;
        N--;
        if (isEmpty()) last = null;
        return item;
    }
}
