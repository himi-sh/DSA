public class Quick {
    public static void main(String[] args) {
        int a[] = {5,4,3,2};
        int n = a.length;
        quickSort(a, 0, n-1);
        printArray(a);
    }

    static void quickSort(int[] a, int lb, int ub) {
        if (lb < ub) {
            int location = partition(a, lb, ub);
            quickSort(a, lb, location - 1);
            quickSort(a, location + 1, ub);
        }
    }

    static int partition(int[] a, int lb, int ub) {
        int pivot = a[lb];
        int start = lb;
        int end = ub;
        while (start < end) {
            while (a[start] <= pivot && start < ub) {
                start++;
            }
            while (a[end] > pivot && end >=lb) {
                end--;
            }
    
            if (start < end) {
                swap(a, start, end);
            }
        }

        swap(a, lb, end);
        return end;
    }

    static void swap(int a[], int first, int second) {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
}
