package JavaAlgorithms.Section1.LinkedList;

/**
 * pushdown stack
 *
 * implemented with a linked list
 *
 * Keep track of size with numberOfItems
 */
public class PushdownStack<Item> {
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

    public Item peek() {
        return (Item) first.item;
    }
}
