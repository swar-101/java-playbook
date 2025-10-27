package io.github.swar101.dsa.datastructure.graph.integer.fixed;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class UndirectedGraph implements Graph {

    int V;
    private final List<Integer>[] adj;

    @SuppressWarnings("unchecked")
    public UndirectedGraph(int V) {
        this.V = V;
        adj = (List<Integer>[]) new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    @Override
    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    public void printAdjacencyList() {
        for (int i = 1; i <= V; i++) {
            System.out.print(i + " -> " + adj[i]);
            System.out.println();
        }
    }

    @Override
    public void iterativeDepthFirstSearch(int src, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(src);
        while (!stack.isEmpty()) {
            int u = stack.pop();

            if (!visited[u]) {
                visited[u] = true;
                System.out.println("Visited: " + u);
                for (int neighbour : adj[u]) {
                    if (!visited[neighbour]) {
                        stack.push(neighbour);
                    }
                }
            }
        }
    }

    @Override
    public void recursiveDepthFirstSearch(int src, boolean[] visited) {
        visited[src] = true;
        System.out.println("Visited: " + src);
        for (int neighbour : adj[src]) {
            if (!visited[neighbour]) {
                recursiveDepthFirstSearch(neighbour, visited);
            }
        }
    }

    // TODO: Implement BFS methods ASAP
}