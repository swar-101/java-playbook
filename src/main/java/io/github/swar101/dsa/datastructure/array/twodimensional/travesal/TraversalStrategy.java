package io.github.swar101.dsa.datastructure.array.twodimensional.travesal;

import java.util.List;

public interface TraversalStrategy {
    List<int[]> getTraversalOrder(int[][] matrix);
}