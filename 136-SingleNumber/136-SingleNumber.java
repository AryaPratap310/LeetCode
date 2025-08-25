// Last updated: 25/08/2025, 17:22:02
class Solution {
    public int singleNumber(int[] nums) {
        int num=nums[0];
        for(int i=1;i<nums.length;i++){
            num=num^nums[i];
        }
        return num;
    }
}