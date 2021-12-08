package com;

import com.bfs.Bfs;
import com.creatematrix.CreateMatrix;
import com.creatematrix.Matrix;
import com.dfs.Dfs;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new CreateMatrix();
        int[][] matrix1 = matrix.createMatrix(7, 7);
        matrix.insertValuesToMatrix(matrix1,0,1);
        matrix.insertValuesToMatrix(matrix1,0,2);
        matrix.insertValuesToMatrix(matrix1,1,3);
        matrix.insertValuesToMatrix(matrix1,1,4);
        matrix.insertValuesToMatrix(matrix1,1,0);
        matrix.insertValuesToMatrix(matrix1,2,5);
        matrix.insertValuesToMatrix(matrix1,2,6);
        matrix.insertValuesToMatrix(matrix1,2,0);
        matrix.insertValuesToMatrix(matrix1,3,1);
        matrix.insertValuesToMatrix(matrix1,4,1);
        matrix.insertValuesToMatrix(matrix1,5,2);
        matrix.insertValuesToMatrix(matrix1,6,2);
        

        matrix.printMatrix(matrix1);
        System.out.println();
        System.out.println();
        System.out.println();

        Dfs dfs = new Dfs();
        dfs.depthFirstSearch(matrix1,0);
    }
}
