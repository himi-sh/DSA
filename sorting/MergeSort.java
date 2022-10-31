public class MergeSort {

    public static void main(String[] args) {
        int[] arr = DataSet.getSampleArray();
        MergeSort ms = new MergeSort();
        Operation.printArray(ms.sort(arr));
    }

    private int[] sort(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return arr;
        }

        // divide
        
        int mid = n/2;  // 4/2
        int[] left = new int[mid];
        int[] right = new int[n-mid];


        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }
        for (int i = 0, j = mid; i < right.length; i++) {
            right[i] = arr[j++];
        }
        return merge(
            sort(left),
            sort(right)
        );
    }

    private int[] merge(int[] left, int[] right) {
        int l_Len = left.length;
        int r_Len = right.length;
        int arr[] = new int[l_Len + r_Len];
        int k = 0;
        int i = 0, j = 0;
        while (i < l_Len && j < r_Len) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < l_Len) {
            arr[k++] = left[i++];
        }

        while (j < r_Len) {
            arr[k++] = right[j++];
        }
        return arr;
    }
    
}
