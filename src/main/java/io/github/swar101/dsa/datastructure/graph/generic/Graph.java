package io.github.swar101.dsa.datastructure.graph.generic;

import java.util.List;
import java.util.Set;

public interface Graph<T> {
    void addEdge(T u, T v);
    List<T> getNeighbors(T u);
    void printAdjacencyList();
    void dfs(T u, Set<T> visited);
}