package com.adjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AdjacencyList implements AdjacencyListFunctions{


    public List<LinkedList> AdjacencyList(int numberOfNodes) {
        List<LinkedList> adjacencyList = new LinkedList<>();
        for (int i = 0; i < numberOfNodes; i++) {
            adjacencyList.set(i, new LinkedList());
        }
        return adjacencyList;
    }

    @Override
    public ArrayList<LinkedList<Node>> adjacencyList(int numberOfNodes) {
        ArrayList<LinkedList<Node>> adjacencyList = new ArrayList<>(numberOfNodes);
        for (int i = 0; i < adjacencyList.size(); i++) {
            adjacencyList.add(i,new LinkedList<Node>());
            System.out.println(adjacencyList(i).toString());
        }
        return adjacencyList;
    }

    @Override
    public void addEdge(ArrayList<LinkedList<Node>> adjacencyList, Node originNode, Node endNode) {
        int originNodeNumber = originNode.getNodeNumber();
        int endNodeNumber = endNode.getNodeNumber();

        LinkedList<Node> originNodesList = adjacencyList.get(originNodeNumber);
        LinkedList<Node> endNodesList = adjacencyList.get(endNodeNumber);

        originNodesList.add(endNode);
        endNodesList.add(originNode);
    }


    @Override
    public void printMatrix(ArrayList<LinkedList<Node>> adjacencyList) {
        for (int i = 0; i < adjacencyList.size(); i++) {
            LinkedList<Node> nodesList = adjacencyList.get(i);
            System.out.println("Node: " + i + " has connections to: ");
            for (int j = 0; j < nodesList.size(); j++) {
                System.out.println(j + " ");
            }
        }
    }

    @Override
    public int rowSummary(ArrayList<LinkedList<Node>> adjacencyList, Node node) {
        return 0;
    }
}
