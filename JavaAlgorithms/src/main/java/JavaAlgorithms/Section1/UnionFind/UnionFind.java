package javaAlgorithms.section1.unionFind;

/**
 * Basically to make my testing life a little less painful
 */
public interface UnionFind {
    int count();

    boolean connected(int p, int q);

    int find(int p);

    void union(int p, int q);
}
