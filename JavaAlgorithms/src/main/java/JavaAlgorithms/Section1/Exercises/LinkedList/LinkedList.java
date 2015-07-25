package JavaAlgorithms.Section1.Exercises.LinkedList;

/**
 * use a stack for these tests
 */

public class LinkedList<Item> {
    private Node first; // top of stack - most recently added node
    private int numberOfItems;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return numberOfItems;
    }

    // add item to top of stack
    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        numberOfItems++;
    }

    // remove item from top of stack
    public Item pop() {
        Item item = (Item) first.item;
        first = first.next;
        numberOfItems--;
        return item;
    }
}
