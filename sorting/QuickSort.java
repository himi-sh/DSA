public class QuickSort {
        int[] arr = DataSet.getSampleArray();
        QuickSort ms = new QuickSort();
        Operation.printArray(ms.sort(arr));
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int partition(int arr[], int low, int high) {
        int pivot = arr[arr.length-1];
        int i = -1;
        for (int j=0; j < arr.length; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap (arr, i + 1, high);
        return (i + 1);
    }
}
