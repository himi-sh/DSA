class Node {
    constructor(value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    constructor() {
        this.root = null;
    }
    insert(value) {
        const newNode = new Node(value);
        if (this.root == null) {
            this.root = newNode;
        } else {
            let current = this.root;
            while (current != null) {
                if (value >= current.value) {
                    if (current.right == null) {
                        current.right = newNode;
                        break;
                    }
                    current = current.right;
                } else {
                    if (current.left == null) {
                        current.left = newNode;
                        break;
                    }
                    current = current.left;
                }
            }
        }
    }

    lookup(value) {
        if (this.root === null) {
            return false;
        }

        let current = this.root;

        while (current != null) {
            if (value === current.value) {
                return current;
            } else if (value < current.value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }

    traverse(root) {
        // root => Left => right
        let current = root;
        if (current == null) {
            return;
        }

        console.log(current.value);

        current = current.left;
        this.traverse(current);
        if (current && current.right != null) {
            current = current.right;
        }
    }

    prevTree(value) {
        if (this.root === null) {
            return false;
        }

        let current = this.root;
        let prevNode = current;

        while (current != null) {
            
            if (value === current.value) {
                return prevNode;
            }
            prevNode = current;
            if (value < current.value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return current;
    }
    remove(value) {
        let prevTree = this.prevTree(value);
        if (prevTree == null) {
            // no node to be removed;
            return;
        }
        let subTree;
        if (prevTree.left && prevTree.left.value == value) {
            subTree = prevTree.left;
            let current = subTree;
            if (current && current.right != null) {
                current = current.right;
                while(current.left != null) {
                    current = current.left;
                }
            } else {
                prevTree.left = subTree.left;
            }
        } else {
            subTree = prevTree.right;
            let current = subTree;
            if (current && current.right != null) {
                current = current.right;
                while(current.left != null) {
                    current = current.left;
                }
                prevTree.right = current;
            } else {
                prevTree.right = subTree.right;
            }
        }

        
    }

    print() {
        console.log(JSON.stringify(this.root));
    }
}

const tree = new BinarySearchTree();
tree.insert(10);
tree.insert(5);
tree.insert(15);
tree.insert(20);
tree.insert(25);
tree.insert(3);
// tree.traverse(tree.root);
console.log(tree.lookup(10));

tree.print();
tree.remove(25);
tree.print();
