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
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(9);
        
        bst.insert(12);
        bst.insert(4);

        System.out.println(bst.root.value);
        System.out.println(bst.root.left.value);
        System.out.println(bst.root.right.value);
    }
}
