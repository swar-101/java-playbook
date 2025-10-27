package io.github.swar101.dsa.datastructure.graph.integer.fixed;


public class GraphTest {

    public static void main(String[] args) {
        testAddEdge();
    }

    private static void testAddEdge() {
        Graph g = createGraph();
        g.printAdjacencyList();
    }

    private static Graph createGraph() {
        Graph g = new UndirectedGraph(5);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(4, 3);
        g.addEdge(5, 2);
        return g;
    }
}