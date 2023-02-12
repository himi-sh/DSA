import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {

    Node root;

    BinarySearchTree() {
        this.root = null;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (this.root == null) {
            this.root = newNode;
        } else {
            Node temp = this.root;
            Node previous = null;
            while(temp != null) {
                previous = temp;
                if (value > temp.value) {
                    // right side
                    temp = temp.right;
                } else {
                    // left side
                    temp = temp.left;
                }
            }
            if (previous.value > value) {
                previous.left = newNode;
            } else {
                previous.right = newNode;
            }
        }
    }

    public void delete(int value) {

    }

    public Node lookup(int value) {

        if (this.root == null) {
            return null;
        } else {
            Node currentNode = this.root;
            while(currentNode != null) {
                if (value == currentNode.value) {
                    return currentNode;
                } else if (value < currentNode.value) {
                    currentNode = currentNode.left;
                } else {
                    currentNode = currentNode.right;
                }
            }
            return null;
        }
    }
    
    // Level order traversal
    public List<Integer> breadthFirstSearch() {
        List<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(this.root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            list.add(currentNode.value);
            System.out.println(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return list;
    }

    public List<Integer> breadthFirstSearchR(Queue<Node> queue, List<Integer> list) {
        if (queue.isEmpty()) {
            return list;
        }
        
        Node curreNode = queue.remove();
        list.add(curreNode.value);

        if (curreNode.left != null) {
            queue.add(curreNode.left);
        }
        if (curreNode.right != null) {
            queue.add(curreNode.right);
        }
        return breadthFirstSearchR(queue, list);
    }

    public List<Integer> DFSInorder() {
        return traverseInOrder(this.root, new ArrayList<>());
    }

    public List<Integer> DFSPreorder() {
        return traversePreOrder(this.root, new ArrayList<>());
    }

    public List<Integer> DFSPostorder() {
        return traversePostOrder(this.root, new ArrayList<>());
    }

    public List<Integer> traverseInOrder(Node node, List<Integer> list) {
        // left root right
        if (node.left  != null) {
            traverseInOrder(node.left, list);
        }
        list.add(node.value);
        if (node.right  != null) {
            traverseInOrder(node.right, list);
        }
        return list;
    }

    public List<Integer> traversePreOrder(Node node, List<Integer> list) {
        list.add(node.value);
        if (node.left != null) {
            traversePreOrder(node.left, list);
        }
        if (node.right != null) {
            traversePreOrder(node.right, list);
        }
        return list;
    }

    public List<Integer> traversePostOrder(Node node, List<Integer> list) {
        
        if (node.left != null) {
            traversePostOrder(node.left, list);
        }
        if (node.right != null) {
            traversePostOrder(node.right, list);
        }
        list.add(node.value);
        return list;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(9);
        bst.insert(12);
        bst.insert(4);
        bst.insert(20);
        bst.insert(70);

        // System.out.println(bst.root.value);
        // System.out.println(bst.root.left.value);
        // System.out.println(bst.root.right.value);
        System.out.println(bst.breadthFirstSearch());
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(bst.root);
        // System.out.println(bst.breadthFirstSearchR(queue, new ArrayList<>()));

        System.out.println("Inorder " + bst.DFSInorder());
        System.out.println("Preorder " + bst.DFSPreorder());
        System.out.println("Postorder " + bst.DFSPostorder());
    }
}
