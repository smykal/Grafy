package com.dfs;

import java.util.ArrayList;
import java.util.List;

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
    
    public void depthFirstSearch(int[][] matrix, int startingVertex) {
        depthDeeperFirstSearch(matrix, startingVertex, new ArrayList<>());
    }

    private void depthDeeperFirstSearch(int[][] matrix, int startingVertex, List<Integer> visitedNodes) {
        visitedNodes.add(startingVertex);
        System.out.println(startingVertex + " -> ");

        for (int i = 0; i < matrix.length; i++) {
            if (!visitedNodes.contains(i) && matrix[startingVertex][i] == 1) {
                depthDeeperFirstSearch(matrix, i, visitedNodes);
            }
        }
    }
}
