class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    constructor(value) {
        this.head = new Node(value);
        this.length = 1;
        this.tail = this.head;
    }

    append(value) {
        let current = this.head;
        // while(current.next !== null) {
        //     current = current.next;
        // }
        const newNode = new Node(value);
        newNode.prev = this.tail;
        this.tail.next = newNode;
        this.tail = newNode;
        this.length++;
    }

    prepend(value) {
        const newNode = new Node(value);
        newNode.next = this.head;
        newNode.next.prev = this.head;
        this.head = newNode;
        this.length++;
    }

    insert(index, value) {
        let current = this.head;
        let i = 0;
        if (index === 0 ) {
            this.prepend(value);
            return;
        }

        if (index >= this.length) {
            this.append(value);
            return;
        }

        while(i < index ) {
            current = current.next;
            i++;
        }

        let newNode = new Node(value);
        newNode.next = current;
        newNode.prev = current.prev;
        current.prev = newNode;
        newNode.prev.next = newNode;
        this.length++;
        console.log(this);
    }

    remove(index) {

    }

    removeFromHead() {

    }

    removeFromTail() {

    }

    printList() {
        let current = this.head;
        const array = [];
        while(current !== null) {
            array.push(current.value);
            current = current.next;
        }
        console.log(array);
    }

}

const doublyList = new DoublyLinkedList(10);
doublyList.append(20);
doublyList.prepend(5);
console.log(doublyList)
doublyList.insert(2, 100);
doublyList.printList();
