var moveZeroes = function(nums) {
    const len = nums.length;
    let zeroStart = -1;
    for (let i = 0; i < len; i++) {
        if (nums[i] == 0) {
            if (zeroStart === -1) {
                zeroStart = i;
            }
        } else if (zeroStart != -1){
            nums[zeroStart] = nums[i];
            nums[i] = 0;
            zeroStart++;
        }
    }
    return nums;
};

const arr = moveZeroes([1,2,9,0,12]);
console.log(arr);

// zeroStart = i;
// if zeroStart already present then set zeroEnd
// if we got any non zero then
//     zeroStart se we will swap
//     and set zeroStart ++
//     and set zeroEnd to this
