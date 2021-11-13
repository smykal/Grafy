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
        adjacencyMatrix.printMatrix(matrix);
    }
}
