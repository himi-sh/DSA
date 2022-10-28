/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    const newArr = [];
    let i = 0;
    let cnt = 0;
    

    if (k > nums.length) {
        k = k % nums.length;
    }

    const len = nums.length;
    for (; i < len; i++) {
        let pos = len - k + i;
        newArr.push(nums[i]);
        if (pos < len && pos >-1) {
            cnt++;
            nums[i] = nums[pos];
        }        
    }
    
    for (let z = 0; z < len -k; z++) {
        nums[cnt++] = newArr[z];
    }
    console.log(nums);
    return nums;
};

rotate([1,2],
    3)


    // [1,2,3,4,5,6,7] => [1,2,3,4,5,6,7]
    // [1,2,3,4,5,6,7] => [7,1,2,3,4,5,6]
    // [-1,-100,3,99] => [-1,-100,3,99]
    // [-1,-100,3,99] => [99,-1,-100,3]
    // [-1,-100,3,99] => [3,99,-1,-100]
    
