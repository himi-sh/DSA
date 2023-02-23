public class Reverse {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int n = arr.length;
        for (int i = 0, j= n-1; i < n /2; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        Util.printArray(arr);
    }
}
