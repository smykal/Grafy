package com.main;

import com.create.CreateMatrix;
import com.create.Matrix;

public class Main {
    public static void main(String[] args) {
        Matrix createMatrix = new CreateMatrix();
        int[][] matrix = createMatrix.createMatrix(5, 7);
        createMatrix.printMatrix(matrix);
    }
}
