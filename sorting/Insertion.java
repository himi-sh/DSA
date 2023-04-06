public class Insertion {
    public static void main(String[] args) {
        int a[] = {5,4,3,2};
        int n = a.length;
        sort(a);
        printArray(a);

    }

    public static void sort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int j = i;;
            while(j > 0 && a[j-1]> a[j]) {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
            
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
}
