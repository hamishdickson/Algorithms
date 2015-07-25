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
        } else if (numberOfItems == 1) {
            last = new Node();
            first.next = last;
            last.item = item;
        } else {
            Node oldLast = last;
            last = new Node();
            last.item = item;
            oldLast.next = last;
        }
        numberOfItems++;
    }

    public Item peek() {
        return (Item) last.item;
    }

    /**
     * created for 1.3.19
     */
    public void removeLast() {
        Node position = first;
        for (int i = 0; i < numberOfItems - 2; i++) {
            position = position.next;
        }

        numberOfItems--;
        position.next = null;

        last = position;
    }
}
