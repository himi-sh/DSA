public class Tester {

    public static void main(String[] args) {

        /**
         * int[] arr1 = {1, 2}; int[] arr2 = {3, 4};
         * MediumSortedArray.findMedianSortedArrays(arr1, arr2);
         */
        /**
         * 
         * LongestPalindrome obj = new LongestPalindrome(); String output =
         * obj.longestPalindrome1("aabaa"); System.out.println(output);
         */
        /**
         * 
         * LongestPalindrome obj = new LongestPalindrome(); String output =
         * obj.longestPalindrome2("aabcd"); System.out.println(output);
         * 
         */
        // LongestUniqueString obj = new LongestUniqueString();
        // int output = obj.lengthOfLongestSubstring("aabcd");
        // System.out.println(output);

        SumKConsecutiveNum obj = new SumKConsecutiveNum();
        int  arr[] = {100, 200, 300, 400}, k = 2;
        int output = obj.gfgMaxSum(arr, k);
        System.out.println(output);
    }
}
