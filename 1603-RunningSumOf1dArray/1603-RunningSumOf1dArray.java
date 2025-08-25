// Last updated: 25/08/2025, 17:17:37
class Solution {
    public int[] runningSum(int[] nums) {

        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];

        }
        return nums;
    }
}