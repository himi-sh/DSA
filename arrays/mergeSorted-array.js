function merge(arr1, arr2) {
    if (arr1.length == 0 & arr2. length == 0) {
        return "Invalid input";
    }

    if (arr1.length == 0) {
        return arr2;
    }

    if (arr2.length == 0 ) {
        return arr1;
    }
    let mergedArr = [];
    let i = 0, j = 0;
    for (; i < arr1.length && j < arr2.length;) {
        if (arr1[i] <= arr2[j]) {
            mergedArr.push(arr1[i++]);
        } else {
            mergedArr.push(arr2[j++]);
        }
    }

    if (arr1.length === i && arr2.length != j) {
        for (; j < arr2.length; j++) {
            mergedArr.push(arr2[j]);
        }
    }

    if (arr2.length === j && arr1.length != i) {
        for (; i < arr1.length; i++) {
            mergedArr.push(arr1[i]);
        }
    }

    return mergedArr;
}

const output = merge([4, 5, 6], [2]);
console.log(output);