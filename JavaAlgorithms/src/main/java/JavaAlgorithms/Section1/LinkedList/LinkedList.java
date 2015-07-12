package JavaAlgorithms.Section1.LinkedList;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/**
 * Created by hamishdickson on 12/07/15.
 *
 * todo - I don't like this at all it's what's in the book though - move to a unit test
 */
public class LinkedList {
    public static void main(String[] args) {
        PushdownStack<String> s = new PushdownStack<>();

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                s.push(item);
            else if (!s.isEmpty()) StdOut.print(s.pop() + " ");
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
}
