package com.main;

import com.adjacencyMatrix.AdjacencyMatrix;
import com.adjacencyMatrix.AdjacencyMatrixFunctions;
import com.createMatrix.CreateMatrix;
import com.createMatrix.Matrix;
import com.search.binary.BinarySearch;
import com.search.binary.BinarySearchWithaAnna;
import com.search.binary.Searching;

public class Main {
    public static void main(String[] args) {

        int[] table = {1,2,3,5,6,8,9};
        Searching searching = new BinarySearch();
        System.out.println(searching.search(table,6));
        System.out.println(searching.search(table,4));

        Searching searching2 = new BinarySearchWithaAnna();
        System.out.println(searching2.search(table,4));

    }
}
