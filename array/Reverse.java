public class Reverse {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        // iterative(arr);
        recurive(arr, 0, arr.length - 1);
        Util.printArray(arr);
    }

    public static void iterative(int[] arr) {
        int n = arr.length;
        for (int i = 0, j= n-1; i < n /2; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }

    public static void recurive(int[] arr, int start, int end) {
        
        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        recurive(arr, start+1, end-1);
    }
}