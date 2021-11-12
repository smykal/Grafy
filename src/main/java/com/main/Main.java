package com.main;

import com.create.CreateMatrix;
import com.create.Matrix;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new CreateMatrix();
        int[][] table = matrix.createMatrix(5, 7);
        matrix.inputValuesToMatrix(table, 2,4);
        matrix.printMatrix(table);
    }
}
