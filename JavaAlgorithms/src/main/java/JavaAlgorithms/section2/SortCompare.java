package javaAlgorithms.section2;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;
import edu.princeton.cs.introcs.Stopwatch;
import javaAlgorithms.section2.insertionSort.Insertion;
import javaAlgorithms.section2.selectionSort.Selection;
import javaAlgorithms.section2.shellSort.Shell;

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
            sort = new Shell();
        }

        sort.sort(a);

        return timer.elapsedTime();
    }

    // use T to sort random arrays of length N
    public double timeRandomInput(String alg, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];

        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++)
                a[i] = StdRandom.uniform();
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args) {
        SortCompare compare = new SortCompare();

        String alg1 = args[0];
        String alg2 = args[1];

        int N = Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);

        double t1 = compare.timeRandomInput(alg1, N, T);
        double t2 = compare.timeRandomInput(alg2, N, T);

        StdOut.printf("For %d random doubles\n    %s is ", N, alg1);
        StdOut.printf("%.1f times faster than %s\n", t2/t1, alg2);
    }
}
