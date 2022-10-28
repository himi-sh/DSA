
class CustomLinkedList {
    constructor(value) {
        this.length = 1;
        this.head = {
            value: value,
            next: null
        };
        this.tail = this.head;
    }

    append(value) {
        let current = this.head;
        const node = {
            value: value,
            next: null
        };

        // while(current.next != null) {
        //     current = current.next;
        // }

        // current.next = node;
        this.tail.next = node;
        this.tail = node;
        this.length++;
    }

    prepend(value) {
        const newNode = {
            value: value,
            next: this.head
        };
        this.head = newNode;
        this.length++;
    }

    printList() {
        const array = [];
        let current = this.head;
        while(current !== null) {
            array.push(current.value);
            current = current.next;
        }
        console.log(array);
    }

    insert(index, value) { // 2, 20
        const newNode = new Node(value);
        if (index == 0) {
            this.prepend(value);
            return;
        }
        if (index >= this.length) {
            this.append(value);
            return;
        }
        let current = this.head;
        let i = 0;
        while(i < index - 1) {
            current = current.next;
            i++;
        }

        newNode.next = current.next;
        current.next = newNode;
        this.length++;
    }

    remove(index) {
        let current = this.head;

        if (index >= this.length) {
            index = this.length - 1;
        }
        let counter = 0;
        let prev = null;
        while (counter < index ) {
            prev = current;
            current = current.next;
            counter++;
        }
        
        if (index == 0) {
            prev.next = current.next;
            this.head = prev;
        } else if (index == this.length -1) {
            this.tail = current;
            current.next = null;
        } else {
            prev.next = current.next;
        }
        this.length--;
    }



    reverse() {
        if (!this.head.next) {
            return this.head;
        }

        let first = this.head;
        let second = first.next;
        let temp = this.head;
        this.tail = this.head;

        while(second) {
            temp = second.next;
            second.next = first;
            // first = null;
            first = second;
            second = temp;
        }
        this.head.next = null;
        this.head = first;
        console.log(this.head)
    }
}

class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

const linkedList = new CustomLinkedList(10);
linkedList.append(5);
linkedList.append(16);
linkedList.prepend(1);
linkedList.insert(1, 23);
linkedList.printList();
// linkedList.remove(10);
// linkedList.printList();
console.log(linkedList);
linkedList.reverse();
linkedList.printList();
console.log(linkedList);

linkedList

Node value = Data;
address / next => who is next node

value + prev + next;

Singly
head->
node1 -> node2 -> node3 -> node4 -> node5 -> null
Circular singly
node1 -> node2 -> node3 -> node4 -> node5 -> node1
Doubly
node1 <-> node2 <-> node3 <-> node4 <-> node5 <-> null


