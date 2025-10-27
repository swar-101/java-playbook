package io.github.swar101.dsa.datastructure.graph.integer.fixed;

public interface Graph {
    void addEdge(int u, int v);
    void printAdjacencyList();
    void iterativeDepthFirstSearch(int src, boolean[] visited);
    void recursiveDepthFirstSearch(int src, boolean[] visited);
}