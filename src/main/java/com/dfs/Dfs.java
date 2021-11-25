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
    public void dfs(int[][] graph, int startingNode) {
    }
    
    public void visitNode(int startingNode) {
        List<Integer> visitedNodes = new ArrayList();
        visitedNodes.add(startingNode);

    }
}
