package javaAlgorithms.section2.insertionSort;

import javaAlgorithms.section2.SortingStub;

/**
 * Insertion Sort
 *
 * Method: For each i from 1 to N-1, exchange a[i] with the entries that are larger in a[0] through a[i-1]. As the
 * index i travels from left to right, the entries to it's left are in sorted order in the array, so the array is
 * fully sorted when i reaches the end
 */
public class Insertion extends SortingStub {

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;

        /**
         * insert a[i] amoung a[i-1], a[i-2], ...
         */
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
                exch(a, j, j - 1);
        }
    }
}

