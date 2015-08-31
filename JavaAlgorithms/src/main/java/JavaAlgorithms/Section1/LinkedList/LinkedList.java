package javaAlgorithms.section1.linkedList;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/**
 * Created by hamishdickson on 12/07/15.
 *
 * todo - I don't like this at all it's what's in the book though - move to a unit test
 */
public class LinkedList {
    public static void main(String[] args) {
        // stack
        StdOut.println("---- Stack ----");
        PushdownStack<String> s = new PushdownStack<String>();

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                s.push(item);
            else if (!s.isEmpty()) StdOut.print(s.pop() + " ");
        }
        StdOut.println("(" + s.size() + " left on stack)");

        // queue
        // todo - clean this up
        StdOut.println("---- Queue ----");
        FifoQueue<String> q = new FifoQueue<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                q.enqueue(item);
            else if (!q.isEmpty()) StdOut.print(q.dequeue() + " ");
        }
        StdOut.println("(" + q.size() + " left on queue)");

        StdOut.println("---- Bag ----");
        Bag<String> b = new Bag<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            b.add(item);
        }
    }
}
