package com.creatematrix;

public interface Matrix {
    public int[][] createMatrix(int vertex, int edges);
    public void printMatrix(int[][] matrix);
    public void insertValuesToMatrix(int[][] matrix, int v, int e);
}
