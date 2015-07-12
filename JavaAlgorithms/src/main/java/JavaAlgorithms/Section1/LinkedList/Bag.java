package JavaAlgorithms.Section1.LinkedList;

import java.util.Iterator;

/**
 * Created by hamishdickson on 12/07/15.
 */
public class Bag<Item> implements Iterable<Item> {
    private Node first;

    public void add(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext() {
            return current != null;
        }

        public void remove() {}

        public Item next() {
            Item item = (Item) current.item;
            current = current.next;
            return item;
        }
    }
}
