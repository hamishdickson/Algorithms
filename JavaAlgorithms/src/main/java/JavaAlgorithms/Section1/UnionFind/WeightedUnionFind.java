package JavaAlgorithms.Section1.UnionFind;

public class WeightedUnionFind {
    private int[] id;
    private int[] sz;
    private int count;

    public WeightedUnionFind(int N) {
        this.count = N;
        this.id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
        this.sz = new int[N];
        for (int i = 0; i < N; i++)
            sz[i] = i;
    }

    public int getCount() {
        return count;
    }

    public boolean isConnected(int p, int q) {
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
