package javaAlgorithms.section1.exercises;

/**
 * Created by hamishdickson on 13/06/15.
 *
 * question 1.1.15
 */
public class Histogram {
    /**
     * number of times the int i appeared in the arg array
     */
    public static int[] histogram(int[] a, int M) {
        int[] out = new int[M];
        for (int i = 0; i < M; i++) {
            out[a[i]]++;
        }
        return out;
    }
}
