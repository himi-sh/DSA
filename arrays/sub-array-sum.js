/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    const length = nums.length;
    const subArrayArr = [];
    
    // 1. length -0 ka
    // 2. length -1 ka
    // 3. length -2 ka
    // 4. length -3 ka
    // 5. length -4 ka
    // 6. length -5 == 1

    
//     length = 5
    
//     j = 0,
//     subLen = 5-0 = 5
//     k = 0
//     i = 0
    
    
//     j = 1,
//     subLen = 5-1 = 4
//     k = 0   (0+4 < 5)
//     i = 3   (0 < 4)
//     5,4,-1,7
    
//     k = 1   (1+4 <= 5)
//     i = 1   (1 <= 4)
//     4,-1,7, 8
    let maxSum = nums[0];
    for (let j = 0; j < length; j++) {
        
        const subLen = length - j; // 5
        // create array till subLen
        for (let start = 0; (start + subLen) <= length; start++) {
            // const arr = [];
            let sum = 0;
            const end = start + subLen;
            for (let i = start; i < end; i++) {
                // arr.push(nums[i]);
                sum += nums[i];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
            // subArrayArr.push(arr);
        }
    }
    
    console.log("n(n^3)", maxSum);
    return maxSum;
    
};

maxSubArray([-1]);

function maxSum(array) {
    let array_max = array[0];
    let max_current = 0;
    let max_last =  array[0];
    const subArrayAr = []
    const subArray = []
    //  [5,4,-1,7, 8]
    for (let i = 1; i < array.length; i++) {
        max_current = max_current + array[i];
        
        if (array_max < max_current) {
            array_max = max_current;
        } 

        if (max_current < 0) {
            max_current = 0;
        }
    }
    console.log(array_max);
    return array_max;
}

function kadensAlgo(nums) {
        
    let globalMax = nums[0];
    let localMax = nums[0];
    
    for (let i = 1; i < nums.length; i++) {
        
        localMax = localMax + nums[i];
        
        if (localMax > globalMax) {
            globalMax = localMax;
        }
    }
    console.log("max", globalMax);
}

maxSum([-1, -2])

kadensAlgo([-1, 0])