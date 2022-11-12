public class MediumSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        if (m == 0 && n == 0) {
            return 0;
        }
        int newArr[] = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        for (;i < m && j < n ; ) {
            if (nums1[i] < nums2[j]) {
                newArr[k++] = nums1[i++];
            } else {
                newArr[k++] = nums2[j++];
            } 
        }

        while (i < m) {
            newArr[k++] = nums1[i++];
        }
        while (j < n) {
            newArr[k++] = nums2[j++];
        }
        // check for even
        double median = 0;
        int mid = (m+n)/2;
        System.out.println(mid);
        if ((m+n) % 2 == 0) {
            median =  (newArr[mid] + newArr[mid-1])*1.0/2;
        } else {
            median = newArr[mid];
        }
        System.out.println(median);
        return median;
    }
}
