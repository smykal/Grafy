package com.create;

public class CreateMatrix implements Matrix{
    @Override
    public int[][] createMatrix(int vertex, int edges) {
        int[][] matrix = new int[vertex][edges];
        return matrix;
    }
}
