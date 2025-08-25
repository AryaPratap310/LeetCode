// Last updated: 25/08/2025, 17:19:50
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count=1;
        int res=1;
        int len=nums.length;
     //  ist.add(nums[0]);
        for(int i=1;i<len;i++){
            if(nums[i]>nums[i-1]){
            
                 count++; 
                if(count>res)res=count;
           }
            else{
                //if(count>res)res=count;
              count=1;

            }
        }
      
      return res;
    }
}