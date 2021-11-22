package com.bfs;

import java.util.PriorityQueue;
import java.util.Queue;

//   Pop the first node from the queue
     //   Check if the node has already been visited, if so skip it
     //   If that node is the one we're searching for, then the search is over
     //   Otherwise, add it to the visited nodes
     //   Add this node's children to the queue and repeat these steps
public class Bfs {
     public void bfs(int[][] graph, int startingNode) {
          Queue<Integer> queue = new PriorityQueue<>();
          queue.offer(startingNode);

          boolean[] visitedNodes = new boolean[graph.length];
          for (int i = 0; i < visitedNodes.length; i++) {
               visitedNodes[i] = false;
          }
          while (!queue.isEmpty()) {
               Integer poll = queue.poll();
               visitedNodes[poll] = true;
               System.out.println(poll + " - ");
               for (int i = 0; i < graph[poll].length; i++) {

                    if (graph[poll][i] != 0 && !visitedNodes[i]) {
                         Integer temp = i;
                         queue.add(temp);
                    }
               }
          }
     }
}
