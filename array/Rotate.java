public class Rotate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}; 
        int k = 2; // no. of rotation
        rotateByK(arr, k);
        // Util.printArray(arr);
    }

    public static void rotateByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // incase k > n
        for (int i = 0; i < n; i++) {
            if (i < k) {
                // rightmost kth element
                System.out.println(arr[n-k+i]);
            } else {
                // print array after k elements
                System.out.println(arr[i-k]);
            }
        }
    }
}
