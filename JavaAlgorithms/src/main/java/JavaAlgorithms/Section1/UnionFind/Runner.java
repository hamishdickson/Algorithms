package javaAlgorithms.section1.unionFind;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/**
 * A runner for the quick find union thingys
 */
public class Runner {
    public static void main(String[] args) {
        int N = StdIn.readInt();

        // just hard code the implementation for now
        UnionFind unionFind = new WeightedUnionFind(N);

        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();

            if (unionFind.connected(p, q)) continue;

            unionFind.union(p, q);

            StdOut.println(p + " " + q);
        }
        StdOut.println(unionFind.count() + " components");
    }
}
