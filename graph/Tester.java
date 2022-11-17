package graph;

public class Tester {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('0');
        graph.addVertex('1');
        graph.addVertex('2');
        graph.addVertex('4');
        graph.addEdge('0', '1');
        graph.showConnections();
    }
    
}
