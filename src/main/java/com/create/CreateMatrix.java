package com.create;

public class CreateMatrix implements Matrix{
    @Override
    public int[][] createMatrix(int vertex, int edges) {
        int[][] matrix = new int[vertex][edges];
        return matrix;
    }

    @Override
    public void printMatrix(int[][] matrix) {
        int e = matrix.length;
        System.out.println("e: " + e );
        int v = matrix[0].length;
        System.out.println("v: " + v );

        for (int i = 0; i < e; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");

        }
    }
}
