package JavaAlgorithms;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

import java.util.Arrays;

/**
 * StdLib is a library provided by the nice Algorithms floke at princeton - it lets you import/export stuff, create
 * pretty graphs etc, without getting too hung up on implementations
 */

public class StdLibTest {
    public static void main( String[] args ) {
        StdLibTest stdLibTest = new StdLibTest();

        String[] a = {"5", "100.0", "200.0"};
        stdLibTest.randomSequence(a);

        // nice picture
        stdLibTest.sortedPlot();
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

    // drawing
    public void sortedPlot() {
        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++)
            a[i] = StdRandom.uniform();
        Arrays.sort(a);

        for (int i = 0; i < N; i++) {
            double x = 1.0*i/N;
            double y = a[i]/2.0;
            double rw = 0.5/N;
            double rh = a[i]/2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
}
