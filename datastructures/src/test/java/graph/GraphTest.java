package graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {
    Graph testObj = new Graph(4);

    @Test
    void addEdge() {
        testObj.addEdge(0,1);
        testObj.addEdge(0,2);
        testObj.addEdge(1,3);
        testObj.addEdge(2,3);
    }

    @Test
    void printGraph() {
        testObj.printGraph();
    }
}