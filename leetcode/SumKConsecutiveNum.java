public class SumKConsecutiveNum {
    public int sumOfConsecutiveNumbers(int[] a, int k) {
        int sum = 0;
        int n = a.length;
        int i = 0, j = 0;
        int max = 0;
        while (j < n - k + 1) { // 100, 200, 300, 400}
            
            if (j-i >= k) {
                i++;
                j = i;
                sum = 0;
            } else {
                sum = sum + a[j];
                j++;
            }

            max = Math.max(max, sum);
        }
        return max;
    }

    public int gfgMaxSum(int a[], int k){

        int n = a.length;

        if (k > n) {
            return -1;
        }
        int window_sum = 0;
        // first k element sum
        for (int i = 0; i < k; i++) {
            window_sum += a[i];
        }
        int max = window_sum;
        for (int i = k; i < n; i++) {
            int windowFirstValue = a[i-k];
            window_sum = window_sum + a[i] - windowFirstValue;
            max = Math.max(max, window_sum);
        }        
        return max;
    }
}
