package com.adjacencyMatrix;

public interface AdjacencyMatrixFunctions {
    public int[][] createMatrix(int vertices);
    public void addEdge(int[][] matrix, int origin, int end);
    public void printMatrix(int[][] matrix);
}
