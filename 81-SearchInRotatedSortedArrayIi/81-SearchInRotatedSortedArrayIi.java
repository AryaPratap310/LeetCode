// Last updated: 25/08/2025, 17:22:28
class Solution {
    public boolean search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return true;
            }

        }
        return false;
    }
}