// Last updated: 25/08/2025, 17:19:12
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            else if(nums[i]<min){
                min=nums[i];
            }
        }
        int ans=(max-k)-(min+k);
        return ans<0?0:ans;
    }
}