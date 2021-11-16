package com.adjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public interface AdjacencyListFunctions {
    public ArrayList<LinkedList<Node>> adjacencyList(int numberOfNodes);
    void addEdge(LinkedList<Node> adjacencyList, Node originNode, Node endNode);
    void printMatrix(LinkedList<Node> adjacencyList);
    int rowSummary(LinkedList<Node> adjacencyList, Node node);
}
