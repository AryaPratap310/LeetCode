// Last updated: 25/08/2025, 17:19:07
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmost(nums,goal)-atmost(nums,goal-1);
    
    //    other solutions at end
    }
    public int atmost(int []nums,int goal){
        int l=0,sum=0,count=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(l<=r && sum>goal){
                sum-=nums[l];
                l++;
            }
            count+=r-l+1;
        }
        return count;
    }
}

