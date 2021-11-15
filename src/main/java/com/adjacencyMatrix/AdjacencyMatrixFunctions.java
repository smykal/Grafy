package com.adjacencyMatrix;

public interface AdjacencyMatrixFunctions {
    int[][] createMatrix(int vertices);
    void addEdge(int[][] matrix, int origin, int end);
    void printMatrix(int[][] matrix);
    int rowSummary(int[][] matrix, int vertex);
}
