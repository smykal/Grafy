package com.adjacencyList;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Getter
public class AdjacencyList implements Adjacency {
    ArrayList<LinkedList<Integer>> adjacencyList = new ArrayList<LinkedList<Integer>>();

    public AdjacencyList(int numberOfNodes) {
        ArrayList<LinkedList<Integer>> adjacencyList = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < numberOfNodes; i++) {
            adjacencyList.add(new LinkedList<Integer>());
        }
        this.adjacencyList = adjacencyList;
    }

    @Override
    public void addEdge(int origin, int end) {
        adjacencyList.get(origin).add(end);
        adjacencyList.get(end).add(origin);
    }

    @Override
    public void printAdjacencyList(ArrayList<LinkedList<Integer>> adjacencyList) {
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.println(adjacencyList.get(i).toString());
        }
    }

    public ArrayList<LinkedList<Integer>> getAdjacencyList() {
        return adjacencyList;
    }
}
