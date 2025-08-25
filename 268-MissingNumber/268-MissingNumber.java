// Last updated: 25/08/2025, 17:21:11
class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return nums.length*(nums.length+1)/2-(sum);
        
    }
}