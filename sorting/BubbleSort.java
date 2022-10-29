public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {
            99, 44,  6,   2, 1,
             5, 63, 87, 283, 4,
             0
        };
        bubbleSort(arr);
        for (int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void bubbleSort(int a[]) {
        int len = a.length;
        for (int i = 0 ; i < len; i++) {
            for (int j = 0 ; j < len-1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        } 
    }
    
}
