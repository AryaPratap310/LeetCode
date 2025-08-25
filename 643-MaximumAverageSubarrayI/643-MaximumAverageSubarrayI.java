// Last updated: 25/08/2025, 17:19:53
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // corner case
        if (nums == null || k <= 0 || nums.length < k) return 0.0;

        // initialize first valid sum and result
        int sum = 0;
        double result;
        for (int i = 0; i < k; i++) {
        sum += nums[i];
        }
        result = (double) sum / k;

        // sliding window
        for (int right = k; right < nums.length; right++) {
        sum += nums[right];
        sum -= nums[right - k];
        result = Math.max(result, (double) sum / k);
        }

        return result;
    }
}