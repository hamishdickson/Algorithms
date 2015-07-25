package JavaAlgorithms.Section1.Exercises.LinkedList;

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
        LinkedList<Integer> linkedList = new LinkedList<>();
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
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);

        LinkedList<Integer> testList = new LinkedList<>();
        testList.push(1);
        testList.push(2);
        testList.push(4);

        linkedList.delete(3);

        assertEquals(true, linkedList.equals(testList));
    }
}