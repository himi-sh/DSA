public class Reverse {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        iterative(arr);
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
}