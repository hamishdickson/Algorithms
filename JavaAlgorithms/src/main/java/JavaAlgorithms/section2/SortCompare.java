package javaAlgorithms.section2;

import edu.princeton.cs.introcs.Stopwatch;
import javaAlgorithms.section2.insertionSort.Insertion;
import javaAlgorithms.section2.selectionSort.Selection;

/**
 * A bit of code allowing comparison of sorting algorithms
 */
public class SortCompare {


    public double time(String alg, Double[] a) {
        Stopwatch timer = new Stopwatch();

        Sort sort;

        // Yucky - strategy pattern here maybe?
        if (alg.equals("Insertion")) {
            sort = new Insertion();
        } else if (alg.equals("Selection")) {
            sort = new Selection();
        } else {
            sort = new Insertion();
        }

        sort.sort(a);

        return timer.elapsedTime();
    }
}
