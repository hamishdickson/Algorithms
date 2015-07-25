package JavaAlgorithms.Section1.Exercises.LinkedList;

import junit.framework.TestCase;
import org.junit.Test;

public class LinkedListTest extends TestCase {

    /**
     * 1.3.19 Write a code fragment that removes the last node in the linked list whose first node is "first".
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
}