package com.adjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class AdjacencyList implements AdjacencyListFunctions{
    @Override
    public ArrayList<LinkedList<Node>> adjacencyList(int numberOfNodes) {

        ArrayList<LinkedList<Node>> adjacencyList;
        adjacencyList = new ArrayList<>(numberOfNodes);
        return adjacencyList;
    }

    @Override
    public void addEdge(LinkedList<Node> adjacencyList, Node originNode, Node endNode) {

    }

    @Override
    public void printMatrix(LinkedList<Node> adjacencyList) {

    }

    @Override
    public int rowSummary(LinkedList<Node> adjacencyList, Node node) {
        return 0;
    }
}
