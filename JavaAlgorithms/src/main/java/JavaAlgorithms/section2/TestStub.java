package javaAlgorithms.section2;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/**
 * Testing stub thing that was provided in the book - I've not got that far yet, but my guess is these should probably
 * just be unit tests
 *
 * also, in the book this is a big horrible static mess - convert to an abstract class and extend it
 */
public abstract class TestStub {
    public abstract void sort(Comparable[] a);

    private boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * Print stuff
     */
    private void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }

    /**
     * is stuff actually sorted?
     */
    public boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i - 1])) return false;
        return true;
    }

    public void runMe(String[] args) {
        String[] a = StdIn.readAllStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
