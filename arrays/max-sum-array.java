import java.util.*;
class Solution {

    public static void main(String[] args) {
        int[] nums = {-2 , -1};
        int result = maxSubArray2(nums);
        System.out.println(result);
    }
    public static int maxSubArray(int[] nums) {
        int[] A = nums;
        int max = Arrays.stream(A).max().getAsInt();
 
        if (max < 0) {
            return max;
        }
 
        int maxSoFar = 0;
 
        int maxEndingHere = 0;
 
        for (int i: A)
        {
            maxEndingHere = maxEndingHere + i;
 
            maxEndingHere = Integer.max(maxEndingHere, 0);
 
            maxSoFar = Integer.max(maxSoFar, maxEndingHere);
        }
 
        return maxSoFar;
    }

    public static int maxSubArray1(int[] nums) {
        // {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            
            for (int start = 0; start < n; start++) {
                int end = start + i;
                int sum = 0;
                for (int k = start; k < end && k<n; k++) {
                    // System.out.println("k " + k + "start " + start);
                    sum = sum + nums[k];
                }
                if (sum > maxSum)
                    maxSum = sum;
            }
        }
        return maxSum;        
    }

    public static int maxSubArray2(int[] nums) {
        // {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0, end = 1; i <n;) {
            sum = 0;
            if (end == n) {
                end = 1;
                i++;
            }
            for (int start = i; start <= end && end <n; start++) {
                sum = sum + nums[start];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
            end++;
            
        }
        return maxSum;        
    }
}