class HashMap {
    constructor(size) {
        this.data = new Array(size);
        this.size = size;
    }

    _hash(key) {
        let hash = 0;
        for (let i =0; i < key.length; i++) {
            hash =  (hash + key.charCodeAt(i))%2;
        }
        return hash; 
    }

    get(key) {
        const address = this._hash(key);
        if (!this.data[address]) {
            // error
        }
        for (let i = 0; i < this.data[address].length; i++) {
            if (this.data[address][i][0] === key) {
                return this.data[address][i][1];
            }
        }
    }

    set(key, value) {
        const address = this._hash(key);
        if (!this.data[address]) {
            this.data[address] = [];
        }
        this.data[address].push([key, value]);
    }

    keys() {
        const keys = [];
        for (let i = 0; i< this.data.length; i++) {
            if (this.data[i]) {
                keys.push(this.data[i][0][0]);
            }
        }
        return keys;
    }
}

const myMap = new HashMap(5);
myMap.set('k', 'hello');
myMap.set('w', 'cello');
myMap.set('a', 'cell');
myMap.set('b', 'xell');
console.log(myMap.data);
const mapValue = myMap.get('a');

console.log(myMap.keys());

