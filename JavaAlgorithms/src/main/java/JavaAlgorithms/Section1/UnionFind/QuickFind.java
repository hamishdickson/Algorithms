package javaAlgorithms.section1.unionFind;

/**
 * This is a starting point - see weighted union find for something way faster
 */
public class QuickFind implements UnionFind {
    private int[] id;
    private int count;

    public QuickFind(int N) {
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
        return id[p];
    }

    /**
     * put p and q in the same component
     */
    public void union(int p, int q){
        int pId = find(p);
        int qId = find(q);

        /**
         * if already in the same component, then not a lot to do
         */
        if (qId == pId) return;

        for (int i = 0; i < id.length; i++)
            if (id[i] == pId) id[i] = qId;

        count--;
    }
}
