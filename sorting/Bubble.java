public class Bubble {
    public static void main(String[] args) {
        int a[] = {5,4,3,2};
        int n = a.length;
        for (int i = 0 ; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (a[j]> a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        printArray(a);
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
 
}
