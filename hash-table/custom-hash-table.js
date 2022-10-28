class CustomHashTable {
    constructor(size) {
        this.data = new Array(size);
        this.data.length = size;
    }

    _hash(key) {
        let hash = 0;
        for (let i = 0; i < key.length; i++) {
            hash = (hash + key.charCodeAt(i) * i) % this.data.length ;

        }
        console.log(hash);
        return hash;
    }

    get(key) {
        const hash = this._hash(key);
        const ob = this.data[hash];
        for (let i = 0; i < ob.length; i++) {
            if (ob[i][0] === key) {
                return ob[i][1];
            }
        }
        return "No value Found"
    }

    set(key, value) {
        const hash = this._hash(key);
        // const ob = {
        //     key: value
        // }
        if (!this.data[hash]) {
            this.data[hash] = [];
        } 
        this.data[hash].push([key, value]);
        console.log(this.data);
    }

    keys() {
        const keysarray = [];
        for (let i = 0; i < this.data.length; i++) {
            const sub = this.data[i];
            if (sub) {
              if (this.data.length > 1) {
                for (let j = 0; j < this.data[i].length; j++) {
                  keysarray.push(this.data[i][j][0]);
                }
              } else {
                keysarray.push(this.data[i][0]);
              }
            }
        }
        return keysarray;
    }
}

const hashTable = new CustomHashTable(50);
hashTable._hash('Hello');
hashTable.set('11', 'Hello');
hashTable.set('1', 'World');
hashTable.set('3', 'Mine');
// hashTable.set(2, 2);
hashTable.get('11');
console.log(hashTable.data);
console.log(hashTable.keys());