public class Binary {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int key = 5;
        System.out.println(iterative(arr,key));
        System.out.println(recursive(arr,key, 0, arr.length-1));
    }

    public static int iterative(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        // int mid = (low + high) /2;

        while (low <= high) {
            int mid = (low + high) /2;
            if (arr[mid] == key) {
                return mid;
            } else if (key <arr[mid]) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return -1;
    }

    public static int recursive(int arr[], int key, int low, int high) { {
        int mid = (low + high) /2;

        if (low > high) {
            return -1;
        } else {
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                return recursive(arr, key, low, mid-1);
            } else {
                return recursive(arr, key, mid+1, high);
            }
        }

       
        
    }
}
}
