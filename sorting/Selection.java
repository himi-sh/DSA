public class Selection {

    public static void main(String[] args) {
        int[] arr = {
            99, 44,  6,   2, 1,
             5, 63, 87, 283, 4,
             0
        };
        selectionSort(arr);
        for (int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void selectionSort(int a[]) {
        int len = a.length;
        for (int i = 0 ; i < len; i++) {
            int min = i;
            for (int j = i + 1 ; j < len; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        } 
    }
    
}
