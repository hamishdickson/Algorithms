package JavaAlgorithms.Section1.Exercises.LinkedList;

/**
 * linked list whos first item is first
 */

public class LinkedList<Item> {
    private Node first;
    private Node last;
    private int numberOfItems;

    public void push(Item item) {
        if (numberOfItems == 0) {
            first = new Node();
            first.item = item;

            last = first;
            last.item = item;
        } else {
            Node oldLast = last;
            last = new Node();
            last.item = item;
            last.next = oldLast;
            numberOfItems++;
        }
    }

    /**
     * created for 1.3.19
     */
    public void removeLast() {

    }
}
