package io.github.swar101.dsa.datastructure.graph.generic;

import java.util.*;

public class UndirectedGraph<T> implements Graph<T> {

    private final Map<T, List<T>> adj;

    public UndirectedGraph() {
        adj = new HashMap<>();
    }

    @Override
    public void addEdge(T u, T v) {
        adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    @Override
    public List<T> getNeighbors(T u) {
        return adj.getOrDefault(u, new ArrayList<>());
    }

    @Override
    public void printAdjacencyList() {
        for (T node : adj.keySet()) {
            System.out.print(node + " -> ");
            for (T nbr : adj.get(node)) {
                System.out.print(nbr + " ");
            }
            System.out.println();
        }
    }

    // I am at node u, here's my map (adj), here's who I've already seen.
    @Override
    public void dfs(T u, Set<T> visited) {
        visited.add(u);
        System.out.println(u);
        for (T v: adj.getOrDefault(u, new ArrayList<>())) {
            if (!visited.contains(v)) {
                dfs(v, visited);
            }
        }
    }
}