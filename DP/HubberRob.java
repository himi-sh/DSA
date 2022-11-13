// TODO: Not solved
class HubberRob {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        } else if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int max = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 2; j<n; j++) {
                sum = 0;
                for (int k = i; k <n ;) {
                    sum = sum + nums[k];
                    k = j + k;
                }
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}