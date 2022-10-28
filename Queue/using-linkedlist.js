class Node {
    constructor(value) {
        this.next = null;
        this.value = value;
    }
}
class Queue {
    constructor() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    peek() {
        return this.first;
    }

    enqueue(value) {
        const newNode = new Node(value);
        if (this.isEmpty()) {
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.next = newNode;
            this.last = newNode;
        }
        this.length++;
    }

    dequeue() {
        if (this.isEmpty()) {
            return "Queue is empty"
        } 
        
        if (this.first === this.last) {
            this.last = null;
        }

        const nodeToRemove = this.first;
        this.first = this.first.next;
        this.length--;
    }

    isEmpty() {
        return this.first === null;
    }
}

let myQueue = new Queue();
myQueue.enqueue(1);
myQueue.enqueue(2);
myQueue.enqueue(3);
myQueue.dequeue();
console.log(myQueue);