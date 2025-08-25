// Last updated: 25/08/2025, 17:18:04
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int[] sum = new int[101];
        for(int i=0; i<nums.length; i++) {
            count[nums[i]]++;
        }

        for(int i=1; i<101; i++) {
            sum[i] = count[i-1] + sum[i-1];
        }
        for(int i=0; i<nums.length; i++) {
            nums[i] = sum[nums[i]];
        }
        return nums;
    }
}