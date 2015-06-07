package JavaAlgorithms;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

/**
 * StdLib is a library provided by the nice Algorithms floke at princeton - it lets you import/export stuff, create
 * pretty graphs etc, without getting too hung up on implementations
 */

public class StdLibTest {
    public static void main( String[] args ) {
        StdLibTest stdLibTest = new StdLibTest();

        String[] a = {"5", "100.0", "200.0"};
        stdLibTest.randomSequence(a);
    }

    // example of stdout
    public void randomSequence(String[] a) {
        int N = Integer.parseInt(a[0]);
        double lo = Double.parseDouble(a[1]);
        double hi = Double.parseDouble(a[2]);

        for (int i = 0; i < N; i++) {
            double x = StdRandom.uniform(lo, hi);
            StdOut.printf("%.2f\n", x);
        }
    }
}
