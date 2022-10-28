class CustomArray {
    constructor() {
        this.length = 0;
        this.data = {};
    }
    
    push(element) {
        this.data[this.length++] = element;
    }

    pop() {
        const element = this.data[this.length - 1];
        this.length--;
        return element;
    }

    shift(index = 0) {
        const element = this.data[index];
        for (var i = index; i < this.length; i++) {
            this.data[i] = this.data[i+1];
        }
        this.length--;
        delete this.data[this.length];
        return element;
    }

    unshift(element) {
        this.length++;
        for (let i = this.length-1; i >= 0; i--) {
            this.data[i] = this.data[i-1];
        }
        this.data[0] = element;
    }

    delete(index) {
        const element = this.shift(index);
        return element;
    }
}

const ar = new CustomArray();
ar.push(10);
ar.push("Himani")
ar.push(20);
console.log(ar.delete(1));
ar.unshift(111);
console.log(ar);