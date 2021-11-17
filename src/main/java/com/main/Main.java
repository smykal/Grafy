package com.main;

import com.adjacencyList.AdjacencyList;
import com.adjacencyList.AdjacencyListFunctions;
import com.adjacencyList.Node;
import com.adjacencyMatrix.AdjacencyMatrix;
import com.adjacencyMatrix.AdjacencyMatrixFunctions;
import com.createMatrix.CreateMatrix;
import com.createMatrix.Matrix;
import com.search.binary.BinarySearch;
import com.search.binary.BinarySearchWithaAnna;
import com.search.binary.Searching;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node('A',0);
        Node node2 = new Node('B',1);
        Node node3 = new Node('C',2);
        Node node4 = new Node('D',3);
        Node node5 = new Node('E',4);

        List<LinkedList> adjacencyList = new AdjacencyList().AdjacencyList(5);
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.println(adjacencyList.get(i).toString());
        }

        //AdjacencyListFunctions adjacencyList = new AdjacencyList(5);

       //ArrayList<LinkedList<Node>> adjacencyLinkedList = adjacencyList.adjacencyList(5);

     //  adjacencyList.addEdge(adjacencyLinkedList, node1,node3 );
     //  adjacencyList.addEdge(adjacencyLinkedList, node1,node4 );
     //  adjacencyList.addEdge(adjacencyLinkedList, node2,node1 );
     //  adjacencyList.addEdge(adjacencyLinkedList, node3,node4 );
     //  adjacencyList.addEdge(adjacencyLinkedList, node3,node5 );
     //  adjacencyList.addEdge(adjacencyLinkedList, node4,node5 );
     //  adjacencyList.addEdge(adjacencyLinkedList, node4,node1 );

     //  adjacencyList.printMatrix(adjacencyLinkedList);
    }
}
