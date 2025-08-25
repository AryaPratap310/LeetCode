// Last updated: 25/08/2025, 17:15:30
class Solution {
    public int specialTriplets(int[] nums) {
        int MOD = 1_000_000_007;
        int n = nums.length;
        long count = 0;

        Map<Integer, Integer> leftFreq = new HashMap<>();
        Map<Integer, Integer> rightFreq = new HashMap<>();

        // Initialize rightFreq with all frequencies
        for (int num : nums) {
            rightFreq.put(num, rightFreq.getOrDefault(num, 0) + 1);
        }

        // Iterate through each j
        for (int j = 0; j < n; j++) {
            int numJ = nums[j];
            // Decrease current num in rightFreq because it's now the center
            rightFreq.put(numJ, rightFreq.get(numJ) - 1);
            if (rightFreq.get(numJ) == 0) {
                rightFreq.remove(numJ);
            }

            // Count how many nums[i] = 2 * nums[j] on the left
            int leftCount = leftFreq.getOrDefault(2 * numJ, 0);
            // Count how many nums[k] = 2 * nums[j] on the right
            int rightCount = rightFreq.getOrDefault(2 * numJ, 0);

            count = (count + (1L * leftCount * rightCount) % MOD) % MOD;

            // Now move nums[j] to leftFreq
            leftFreq.put(numJ, leftFreq.getOrDefault(numJ, 0) + 1);
        }

        return (int) count;
    }
        
       
        
}