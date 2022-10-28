function factorial(number) {
    if (number === 1 || number === 2) 
        return number;
    return number * factorial(number - 1);
}

console.log(factorial(2));

