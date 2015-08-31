package javaAlgorithms.section2.insertionSort;

import javaAlgorithms.section2.Sort;
import javaAlgorithms.section2.SortingStub;

/**
 * Insertion Sort
 *
 * Method: For each i from 1 to N-1, exchange a[i] with the entries that are larger in a[0] through a[i-1]. As the
 * index i travels from left to right, the entries to it's left are in sorted order in the array, so the array is
 * fully sorted when i reaches the end
 *
 * As in selection sort, items to the left are sorted, but are not in their final position as they may be moved
 * for smaller items found as we progress through the collection
 *
 * Analysis: ~N^2 / 4 compares and ~N^2 / 4 exchanges on ave for randomly ordered. Worst case is ~N^2 / 2 compares
 * and ~N^2 / 2 exchanges. Best case is N - 1 compares and 0 exchanges.
 *
 * Notes: Unlike selection sort, time depends on existing order.
 *
 * Best sorting algorithm for: certain types of non-random arrays that often arise in real life. (ie partially sorted arrays)
 *
 * Examples
 *  - small array appended to larger sorted array
 *  - an array where each entry is not far from it's final position
 *  - an array where only a few entries are not in place
 *
 * (Selection sort would be a poor choice for such arrays)
 *
 * Can be speed up by: changing the inner loop so that it moves larger entries to the right, rather than moving them to
 * position.
 */
public class Insertion extends SortingStub implements Sort {

    public void sort(Comparable[] a) {
        int N = a.length;

        /**
         * insert a[i] among a[i-1], a[i-2], ...
         */
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
                exch(a, j, j - 1);
        }
    }
}

