class Stack {
    constructor(size) {
        this.top = 0;
        this.data = [];
        this.size = size;
    }

    push(value) {
        if (this.isFull()) {
            return "Stack is Full"
        }
        this.data[this.top++] = value;
        return this.data;
    }

    pop() {
        if (this.isEmpty()) {
            return "Stack is Empty"
        }
        const removedElement = this.data[this.top];
        this.top--;
        return removedElement;
    }

    peek() {

    }

    isFull() {
        return this.top === this.size;
    }

    isEmpty() {
        return this.top === 0;
    }
}

let stack = new Stack(10);
stack.push(10);
stack.push(20);
stack.push(30);
console.log(stack);

