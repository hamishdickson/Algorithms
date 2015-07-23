package JavaAlgorithms.Section1.Exercises;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

public class HistogramTest extends TestCase {
    @Test
    public void testThatSimpleArrayWorks() {
        Histogram histogram = new Histogram();

        int[] in = {1, 3, 4, 4, 4};
        int[] out = {0, 1, 0, 1, 3};

        assertEquals(true, Arrays.equals(histogram.histogram(in, 5), out));
    }

}