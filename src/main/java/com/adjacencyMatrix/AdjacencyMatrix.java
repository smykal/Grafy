package com.adjacencyMatrix;

public class AdjacencyMatrix implements AdjacencyMatrixFunctions {
    @Override
    public int[][] createMatrix(int vertices) {
        int[][] matrix = new int[vertices][vertices];
       return matrix;
    }

    @Override
    public void addEdge(int[][] matrix, int origin, int end) {
        matrix[origin][end] = 1;
        matrix[end][origin] = 1;
    }

}
