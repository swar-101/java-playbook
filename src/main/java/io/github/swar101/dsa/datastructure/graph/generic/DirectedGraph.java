package io.github.swar101.dsa.datastructure.graph.generic;

import java.util.*;

public class DirectedGraph<T> implements Graph<T> {

    private final Map<T, List<T>> adj;

    public DirectedGraph() {
        adj = new HashMap<>();
    }

    @Override
    public void addEdge(T u, T v) {
        adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
    }

    @Override
    public List<T> getNeighbors(T u) {
        return List.of();
    }

    @Override
    public void printAdjacencyList() {

    }

    @Override
    public void dfs(T u, Set<T> visited) {

    }
}
