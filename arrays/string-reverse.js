function reverse(str) {
    const ar = str.split('');
    let newStr = '';
    for (let i = ar.length - 1; i >= 0 ; i--) {
        newStr += ar[i];
    }
    return newStr;
}

console.log(reverse("Himani"));

