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

    /**
     * So the idea here is to take two arrays and merge them into one. The strategy is easy, create an output array
     * and then take the smallest element available from each array. However, to mergesort a large array, this is less
     * trivial - the problem comes with creating the output array - it could be huge.
     *
     * It would be better if we could sort the first array in place, then the 2nd array in place. Then do the merge
     * by moving elements around. Coming up with a way to do this is hard....
     *
     * Implementation: first copy into the auxilary array aux[] and then merging back to a[].
     *
     * In the merge (2nd for loop), there are 4 combinations: left half exhausted (take from the right), right
     * half exhausted (take from the left), current key on the right < left (take from the right)
     * and current key on right >= left (take from left)
     */
    protected void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;
        Comparable[] aux = new Comparable[a.length];

        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (lessThan(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }
}
