package com.main;

import com.adjacencyMatrix.AdjacencyMatrix;
import com.adjacencyMatrix.AdjacencyMatrixFunctions;
import com.createMatrix.CreateMatrix;
import com.createMatrix.Matrix;

public class Main {
    public static void main(String[] args) {
        AdjacencyMatrixFunctions adjacencyMatrix = new AdjacencyMatrix();
        int[][] matrix = adjacencyMatrix.createMatrix(6);
        adjacencyMatrix.addEdge(matrix, 2,5);
        adjacencyMatrix.addEdge(matrix, 2,3);
        adjacencyMatrix.printMatrix(matrix);
        adjacencyMatrix.rowSummary(matrix, 0);
        adjacencyMatrix.rowSummary(matrix, 1);
        adjacencyMatrix.rowSummary(matrix, 2);
        adjacencyMatrix.rowSummary(matrix, 3);
        adjacencyMatrix.rowSummary(matrix, 4);
        adjacencyMatrix.rowSummary(matrix, 5);
    }
}
