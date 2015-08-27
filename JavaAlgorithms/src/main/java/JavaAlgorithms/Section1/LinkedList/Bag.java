package javaAlgorithms.section1.linkedList;

import java.util.Iterator;

/**
 * linked list implementation of a bag
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
