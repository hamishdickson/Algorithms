package javaAlgorithms.section2.mergeSort;

import javaAlgorithms.section2.Sort;
import javaAlgorithms.section2.SortingStub;

/**
 * Merge sort bottom up
 */
public class MergeBU extends SortingStub implements Sort {
    private Comparable[] aux;

    public void sort(Comparable[] a) {
        int N = a.length;
        aux = new Comparable[N];

        for (int sz = 1; sz < N; sz = sz+sz)
            for (int lo = 0; lo < N - sz; lo += sz+sz)
                merge(a, lo, lo+sz-1, Math.min(lo+sz+sz, N-1));
    }
}
