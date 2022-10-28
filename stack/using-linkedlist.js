class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

class Stack {

    constructor() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    push(value) {
        let newNode = new Node(value);
        newNode.next = this.top;
        this.top = newNode;
        if (this.length === 0) {
            this.bottom = this.top;
        }
        this.length++;
    }

    peek() {
        return this.top;
    }

    pop() {
        if (!this.top) {
            return null;
        }
        if (this.top === this.bottom) {
            this.bottom = null;
        }
        let deletedNode = this.top;
        this.top = this.top.next;
        this.length--;
        return deletedNode;
    }

    print() {

    }
}

let stack = new Stack();
stack.push(10);
stack.push(20);
stack.push(30);
console.log(stack);
stack.pop();
console.log(stack);