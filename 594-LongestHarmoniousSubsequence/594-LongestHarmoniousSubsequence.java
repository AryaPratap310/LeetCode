// Last updated: 25/08/2025, 17:20:00
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int ans=0;
        for(int r=0;r<nums.length;r++){
            while(nums[r]-nums[l]>1){
                l++;
            }
            if(nums[r]-nums[l]==1){
                ans=Math.max(ans,r-l+1);
            }
        }
        return ans;
    }
}