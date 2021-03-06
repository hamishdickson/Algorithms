package javaAlgorithms.section1.exercises.linkedList;

import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

public class LinkedListTest extends TestCase {

    /**
     * 1.3.19 Write a code fragment that removes the last node in the linked list whose first node is "first".
     *
     * note: this isn't really safe code - needs some error handling really
     */
    @Test
    public void testRemoveLastNode() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);

        linkedList.removeLast();

        assertEquals(Integer.valueOf(3), linkedList.peek());
    }

    /**
     * 1.3.20 write a method delete() that takes an int arg k and deletes the kth element in the linked list, if it
     * exists
     *
     * note: again, not really safe
     */
    @Test
    @Ignore
    public void testNewDeleteMethod() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);

        LinkedList<Integer> testList = new LinkedList<Integer>();
        testList.push(1);
        testList.push(2);
        testList.push(4);

        linkedList.delete(3);

        assertEquals(true, linkedList.equals(testList));
    }

    /**
     * 1.3.21 Write a method find() that takes a linked list and a string key as arguments and returns true if some
     * node in the list has key as it's item field, false if not
     *
     * actually implement this a bit differently
     */
    @Test
    public void testFindMethod() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);

        assertEquals(true, linkedList.find(1));

    }

    /**
     * 1.3.24 write a method removeAfter() that takes a linked list node as arg and removes the node following it
     */
    @Test
    public void testRemoveAfter() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);

        LinkedList<Integer> linkedListAfter = new LinkedList<Integer>();
        linkedListAfter.push(1);
        linkedListAfter.push(2);
        linkedListAfter.push(4);

        linkedList.removeAfter(2);

        assertEquals(true, linkedList.equals(linkedListAfter));
    }
}