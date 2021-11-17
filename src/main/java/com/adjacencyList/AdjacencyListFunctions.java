package com.adjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public interface AdjacencyListFunctions {

    public ArrayList<LinkedList<Node>> adjacencyList(int numberOfNodes);
    void addEdge(ArrayList<LinkedList<Node>> adjacencyList, Node originNode, Node endNode);
    void printMatrix(ArrayList<LinkedList<Node>> adjacencyList);
    int rowSummary(ArrayList<LinkedList<Node>> adjacencyList, Node node);
}
