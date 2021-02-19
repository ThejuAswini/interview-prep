package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
    public String bfs(Graph g) {
        String result = "";

        //check for no vertices
        if (g.vertices < 1) {
            return result;
        }

        //we can't go into a constant loop - So maintain a visited[ ]
        boolean[] visited = new boolean[g.vertices];

        for (int i = 0; i < g.vertices; i++) {
            if(!visited[i]) {
                result = result + bfsVisit(g, i, visited);
            }
        }

        return result;
    }

    public String bfsVisit(Graph g, int source, boolean[] visited) {
        String result = "";
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        visited[source] = true;

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            result += String.valueOf(currentNode);

            DoublyLinkedList<Integer>.Node temp = null;

        }
        return result;
    }
}
