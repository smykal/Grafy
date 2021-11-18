package com.adjacencyList;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.LinkedList;

public interface Adjacency {
void addEdge(int origin, int end);
void printAdjacencyList(ArrayList<LinkedList<Integer>> adjacencyList);
}
