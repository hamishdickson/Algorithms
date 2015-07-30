package JavaAlgorithms.Section1.Exercises.LinkedList;

/**
 * Exercise 1.3.29 Write a Queue implementation that uses a circular linked list, which is the same as a linked list
 * except that no links are null and the value of last.next is first whenever the list is not empty. Keep only one
 * Node instance variable (last)
 */

public class CircularQueue<Item> {
    private Node first;
    private Node last;
    private int numberOfItems;

    public void push(Item item) {
        Node newItem = new Node();
        newItem.item = item;
        if (numberOfItems == 0) {
            first = newItem;
            last = newItem;
            first.next = last;
        } else {
            Node oldLast = last;
            last = newItem;
            oldLast.next = last;
        }
        numberOfItems++;
    }
}
