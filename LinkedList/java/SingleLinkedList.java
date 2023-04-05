public class SingleLinkedList {
    Node head;

    SingleLinkedList() {
        this.head = null;
    }

    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        Node current = this.head;
        while(current.next!=null) {
            current = current.next;
        }
        current.next = newNode;
    }

    
}
