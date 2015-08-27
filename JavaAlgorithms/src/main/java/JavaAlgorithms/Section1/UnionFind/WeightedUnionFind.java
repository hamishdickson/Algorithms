package javaAlgorithms.section1.unionFind;

/**
 * Weighted Union Find
 *
 * Definitions:
 *  - size: of a tree is the number of nodes
 *  - depth: of a node is the number links on the path from it to the root
 *  - height: max depth among roots
 */

public class WeightedUnionFind implements UnionFind {
    private int[] id; // parent link (site indexed)
    private int[] sz; // size of component for roots (site indexed)
    private int count; // number of components

    public WeightedUnionFind(int N) {
        this.count = N;

        this.sz = new int[N];
        this.id = new int[N];

        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = i;
        }
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        while (p != id[p])
            p = id[p];
        return p;
    }

    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if (p == q) return;

        /**
         * This is the trick - add the smaller tree to the root of the larger tree. This way the height is minimized
         */
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[i] = i;
            sz[i] += sz[j];
        }

        count--;
    }

}
