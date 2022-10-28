class CustomGraph {
    constructor() {
        this.totalNodes = 0;
        this.adjacentList = {};
    }

    addVertex(node) {
        this.totalNodes++;
        this.adjacentList[node] = [];
    }

    addEdge(node1, node2) {
        this.adjacentList[node1].push(node2);
        this.adjacentList[node2].push(node1);
    }
}

const graph = new CustomGraph();
graph.addVertex('4');
graph.addVertex('2');
graph.addEdge('4', '2');