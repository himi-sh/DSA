

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        implementMergeSort(arr, 0, 4);
    }

    public static void merge(int arr[], int start,int mid,  int end) {
        int n = mid - start + 1;
        int m = end - mid;
        int left[] = new int[n];
        int right[] = new int[m];

        for (int i = 0; i < n; i++) {
            left[i] = arr[start + i]; 
        }
        for (int j =0; j < m; j++) {
            right[j] = arr[mid + 1+ j];
        }

        int i = 0;
        int j = 0;
        int k = start;
      
        while(i<mid && j<end){
          if(left[i]<=right[j]){
            arr[k] = left[i];
            i++; k++;
          } else{
            arr[k] = right[j];
            j++; k++;
          }
        }
        while(i<mid){
            arr[k] = arr[i];
            i++; k++;
        }
        while(j<end){
            arr[k] = arr[j];
            j++; k++;
        }
      }
      public static int[] implementMergeSort(int arr[], int start, int end)
          {
            if (start < end) {
              int mid = (start+end)/2;
              implementMergeSort(arr, start, mid);
              implementMergeSort(arr, mid+1, end);
              merge(arr, start, mid, end);
            }
            return arr;
          }
}
