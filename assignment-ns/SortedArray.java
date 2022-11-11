public class SortedArray {

    public static void checkIfSorted(int[] arr) {

        int len = arr.length;
        int nCount = 0;
        int pCount = 0;
    
        for (int i = 0; i < len - 1; i++) {
            int diff = arr[i+1] - arr[i];
            if (diff >=0) {
                pCount++;
            } else if (diff < 0) {
                nCount++;
            } else {
                pCount++;
                nCount++;
            }
        }

        if (arr[0]-arr[len-1] > 0) {
            pCount++;
        } else if (arr[0]-arr[len-1] < 0) {
            nCount++;
        } else {
            pCount++;
            nCount++;
        }

        if (pCount == 0 || nCount == 0) {
            System.out.println("No");
        } else {
        if (pCount == len-1 || nCount == len-1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1 ,2, 3};
        checkIfSorted(arr);
    }
    
}
