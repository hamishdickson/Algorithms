package javaAlgorithms.section1.unionFind;

/**
 * A bit better than quick find, but still not the fastest thing out there
 */
public class QuickUnion implements UnionFind {
    private int[] id;
    private int count;

    public QuickUnion(int N) {
        this.count = N;
        id = new int[N];

        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p){
        while (p != id[p])
            p = id[p];

        return p;
    }

    public void union(int p, int q){
        int i = find(p);
        int j = find(q);

        if (i == j) return;

        id[i] = j;

        count--;
    }
}
