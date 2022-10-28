function fibonacciIterative(num) {
    f0 = 0;
    f1 = 1;


    if (num === 0 || num === 1) {
        return num;
    }

    for (let i = 1; i < num; i++) {
        f2 = f0 + f1;
        f0 = f1;
        f1 = f2;
    }

    return f2;
}

function fibonacciRecursive(num) {

    if (num === 0 || num === 1) {
        return num;
    }

    return fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2);
}

const iterative = fibonacciIterative(6);
console.log(iterative);

const recursive = fibonacciRecursive(6);
console.log(recursive);


function fibonacciRecursiveNew(num) {
    if (num === 0 || num === 1) {
        return num;
    }



}

function fibonacciIterativeNew(num) {
    a = 0;
    b = 1;

    for (i = 0; i < num; i++) {
        print(a);
        c = a + b; // 3 
        a = b;  // 2
        b = c; // 3
    }
}

function fibonacciIterativeNew2(num) {
    let arr = [0, 1];
    for (i = 2; i <= num; i++) {
        arr.push(arr[i-2] + arr[i-1]);
    }
}

function print(value) {
    console.log(value);
}
print('start');
fibonacciIterativeNew(8);