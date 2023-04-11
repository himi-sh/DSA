public class Merge {
    public static void main(String[] args) {
        int a[] = {5,4,3,2};
        int n = a.length;
        mergeSort(a, 0, n-1);
        printArray(a);
    }

    private static void mergeSort(int[] a, int left, int right) {
        if ( left < right) {
            int mid = (left + right ) / 2;
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);
            merge(a, left, mid, right);
        }


    }

    private static void merge(int a[], int left, int mid, int right) {
        int k = left;
        int L[] = new int[mid - left + 1];
        int R[] = new int[right - mid];

        for (int i = 0; i < L.length; ++i)
            L[i] = a[left + i];
        for (int j = 0; j < R.length; ++j)
            R[j] = a[mid + 1 + j];
    
        int i = 0;
        int j = 0;
        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                // a[k] = a[left];
                a[k] = L[i];
                i++;
                k++;
            }
            if (L[i] > R[j]) {
                // a[k] = a[mid];
                a[k] = R[j];
                j++;
                k++;
            }
        }

        while (i < L.length) {
            a[k] = a[i];
                i++;
                k++;
        }

        while (j < R.length) {
            a[k] = R[j];
            j++;
            k++;
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
