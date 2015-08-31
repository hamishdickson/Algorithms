package javaAlgorithms.section2;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/**
 * Testing stub thing that was provided in the book - I've not got that far yet, but my guess is these should probably
 * just be unit tests
 *
 * also, in the book this is a big horrible static mess - convert to an abstract class and extend it
 */
public abstract class SortingStub implements Sort {

    protected boolean lessThan(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    protected void swapElements(Comparable[] a, int firstIndex, int secondIndex) {
        Comparable originalFirstElement = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = originalFirstElement;
    }

    /**
     * Print stuff
     */
    protected void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }

    /**
     * is stuff actually sorted?
     */
    protected boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++)
            if (lessThan(a[i], a[i - 1])) return false;
        return true;
    }

    protected void runMe(String[] args) {
        String[] a = StdIn.readAllStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
