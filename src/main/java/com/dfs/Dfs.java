package com.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

        // function VisitNode(u):
        // oznacz u jako odwiedzony
        // dla każdego wierzchołka v na liście sąsiedztwa u:
        // jeżeli v nieodwiedzony:
        // VisitNode(v)

        // function DepthFirstSearch(Graf G):
        // dla każdego wierzchołka u z grafu G:
        // oznacz u jako nieodwiedzony
        // dla każdego wierzchołka u z grafu G:
        // jeżeli u nieodwiedzony:
        // VisitNode(u)

public class Dfs {

    public void visitNode(int[][] matrix, int vertex) {
        List<Integer> visitedNotes = new ArrayList<>();
        visitedNotes.add(vertex);

        for (int i = 0; i < matrix[vertex].length; i++) {
            if (matrix[vertex][i] != 0 && !visitedNotes.contains(matrix[vertex][i]) ) {
                visitNode(matrix,i);
            }
        }
    }
    
    void depthFirstSearch(int[][] matrix) {
        List<Integer> visitedNodes = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            visitedNodes.add(i);
        }
        for (int i = 0; i < matrix.length; i++) {
            if (visitedNodes.contains(i)) {
                visitNode(matrix,i);
                visitedNodes.remove(i);
            }
        }
    }
}
