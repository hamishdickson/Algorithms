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
     *
     * loop through linked list and get to the second to last position (it's - 2 because you want the one before the one
     * you want to set to last... that totally makes sense)
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

    public void delete(int k) {
        if (numberOfItems > k) {
            Node position = first;
            for (int i = 1; i < k - 1; i++) {
                position = position.next;
            }

            position.next = position.next.next;

            numberOfItems--;
        }
    }

    /**
     * @param key item value
     * @return if key is in list
     */
    public boolean find(Item key) {
        Node position = first;
        for (int i = 1; i < numberOfItems; i++) {
            if (position.item.equals(key)) return true;
            position = position.next;
        }
        return false;
    }
}
