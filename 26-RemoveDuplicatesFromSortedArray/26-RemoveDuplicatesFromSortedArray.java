// Last updated: 25/08/2025, 17:23:09
class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0;
        // int idx=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[c]=nums[i];
                c++;
                // idx++;
            }
        }
        nums[c]=nums[nums.length-1];
        return c+1;
    }
}