public class Insertion {

    public static void main(String[] args) {
        int[] arr = {
            99, 44,  6,   2, 1,
             5, 63, 87, 283, 4,
             0
        };
        insertionSort(arr);
        for (int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    private static void insertionSort(int a[]) {
        int len = a.length;
        for (int i=1; i < len; i++) {
            int key = a[i];
            int j = i - 1;

            while (j>=0 && a[j] > key) {
                a[j+1] = a[j];
                j--;
            }
            j = j + 1;
            a[j] = key;
            // for (int j = i; j>0; j--) {
            //     if (a[j-1] > a[j]) {
            //         int temp = a[j];
            //         a[j] = a[j-1];
            //         a[j-1] = temp;
            //     }
            // }
        }
    }
    
    
}
