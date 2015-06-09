package JavaAlgorithms;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

import java.util.Arrays;

/**
 * Created by hamishdickson on 08/06/15.
 *
 * Program takes the name of a whitelist file (ie a seq of ints) as argument and filters any entry that is on the
 * whitelist from standard output, leaving only integers that are not on the whitelist on std output
 *
 * running: java BinarySearch largeW.txt < largeT.txt
 *
 * running time: O(log n)
 *
 * note: array a must be sorted
 */
public class BinarySearch {

    /**
     * rank = binary search
     * @param key to find in a
     * @param a array of ints to search
     * @return position
     */
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid - 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) == -1)
                StdOut.println(key);
        }
    }
}
