package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    int numberOfNodes;
    Map<Character, List<Character>> adjacentList;

    Graph() {
        this.numberOfNodes = 0;
        this.adjacentList = new HashMap<>();

    }

    public void addVertex(char node) {
        this.adjacentList.put(node, new ArrayList<>());
        this.numberOfNodes++;
    }

    public void addEdge(char node1, char node2) {
        List<Character> list1 = this.adjacentList.get(node1);
        list1.add(node2);

        List<Character> list2 = this.adjacentList.get(node2);
        list2.add(node1);

        // bidirectional
        this.adjacentList.put(node1, list1);
        this.adjacentList.put(node2, list2);
        // this.numberOfNodes++;
    }

    public String showConnections() {
       StringBuilder builder = new StringBuilder();
 
        for (Character key : adjacentList.keySet()) {
            builder.append(key.toString() + ": ");
            for (Character edge : adjacentList.get(key)) {
                builder.append(edge.toString() + " ");
            }
            builder.append("\n");
        }
        String str = builder.toString();
        System.out.println(str);
        return str;
    }
    
}
