package javaAlgorithms.section2.selectionSort;

import javaAlgorithms.section2.Sort;
import javaAlgorithms.section2.SortingStub;

/**
 * Selection Sort - sort a into increasing order
 *
 * Method: First, find the smallest entry in the array and swapElements it with the first element. Then find the second smallest
 * etc etc
 *
 * Analysis: uses ~N^2 / 2 compares and N exchanges to sort an array of length N
 *
 * Notes: Insensitive to input - takes almost the same time for already sorted array
 */
public class Selection extends SortingStub implements Sort {
    public void sort(Comparable[] a) {
        int N = a.length;

        for (int i = 0; i < N; i++) {
            /**
             * swapElements a[i] with the smallest entry in a[a + 1, ... N)
             */
            int min = i;

            for (int j = i + 1; j < N; j++) {
                if (lessThan(a[j], a[min]))
                    min = j;
                swapElements(a, i, min);
            }

        }

    }
}
