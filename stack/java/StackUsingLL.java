import javax.swing.text.StyledEditorKit.BoldAction;

public class StackUsingLL {
    StackNode root;

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        if (this.root == null) {
            this.root = newNode;
        } else {
            newNode.next = this.root.next;
            this.root = newNode;
        }
    }

    public int pop() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            int data = this.root.data;
            this.root = this.root.next;
            return data;
        }
    }

    public int peek() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
        return this.root.data;
        }
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public boolean isFull() {
        return false;
    }
}


