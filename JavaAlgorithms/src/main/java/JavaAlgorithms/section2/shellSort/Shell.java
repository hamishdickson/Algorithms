package javaAlgorithms.section2.shellSort;

import javaAlgorithms.section2.Sort;
import javaAlgorithms.section2.SortingStub;

/**
 * Shell Sort
 *
 * Based on insertion sort - insertion sort only lets you move things one element at a time, Shell sort allows exchanges
 * of array indicies that are far apart
 *
 * Method: Arrange the array to give it the property that taking every hth entry (starting anywhere) will give it a
 * sorted sequence. Such an array is said to be h-sorted. This gives h sorted subarrays
 *
 * This is the only sort that we consider OK on random arrays.
 */
public class Shell extends SortingStub implements Sort{
    public void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;

        while (h < N/3)
            h = 3*h + 1;

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && lessThan(a[j], a[j - h]); j -= h)
                    swapElements(a, j, j - h);
            }
            h = h/3;
        }
    }
}
