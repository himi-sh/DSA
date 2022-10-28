function mergeSortedArrays(array1, array2) {
    const totalLength = array1.length + array2.length;
    let sortedArray = [];
    for (let i=0,j=0,k=0; k < totalLength; k++) {
        if (array1[i] > array2[j]) {
            sortedArray.push(array2[j++]);
        } else {
            sortedArray.push(array1[i++]);
        }
    }
    return sortedArray;
}

const array1 = [2,5,6];
const array2 = [1,3,4];

console.log(mergeSortedArrays(array1, array2)); 