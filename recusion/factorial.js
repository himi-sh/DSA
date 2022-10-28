function findFactorialRecusive(num) {
    if (num === 2) {
        return num;
    }
    return num * findFactorialRecusive(num - 1);
}

function findFactorialIterative(num) {
    let fact = 1;
    for (let i = num; i > 1; i--) {
        fact = fact * i;
    }
    console.log(fact);
}

findFactorialIterative(5);

console.log(findFactorialRecusive(5));
