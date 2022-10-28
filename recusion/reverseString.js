function reverseIterative (str) {
    let len = str.length;
    let newStr = "";
    for (let i = len - 1; i >=0; i--) {
        newStr = newStr + str[i];
    }
    return newStr;
}

function reverseRecursive (str) {
    if (str === "") {
        return "";
    } else {
        return reverseRecursive (str.substr(1)) + str.charAt(0);
    }
}



output = reverseIterative("Himani");
console.log(output);

output = reverseRecursive("Himani");
console.log(output);


function reverseRecursiveNew(str) {
    if (str === "") {
        return "";
    } else {
        return reverseRecursive (str.substr(str.len-1));
    }
}

console.log('New');
console.log(reverseRecursiveNew('Himani'));