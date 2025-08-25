// Last updated: 25/08/2025, 17:20:26
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
           
            if(nums[i]==0){
                c=0;
            }else{
                c++;
            }
            // c++;
            ans= Math.max(ans,c);
            
        }
        return ans;
    }
}