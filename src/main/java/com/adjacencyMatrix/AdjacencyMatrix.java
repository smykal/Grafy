package com.adjacencyMatrix;

public class AdjacencyMatrix implements AdjacencyMatrixFunctions {
    @Override
    public int[][] createMatrix(int vertices) {
        int[][] matrix = new int[vertices][vertices];
       return matrix;
    }

    @Override
    public void addEdge(int[][] matrix, int origin, int end) {
        if (origin == end) {
            System.out.println("loop edge");
        } else {
            matrix[origin][end] = 1;
            matrix[end][origin] = 1;
        }
    }

    @Override
    public void printMatrix(int[][] matrix) {
        System.out.print("     ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(i + "    ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
