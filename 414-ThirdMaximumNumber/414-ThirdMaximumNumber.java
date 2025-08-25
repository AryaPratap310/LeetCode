// Last updated: 25/08/2025, 17:20:44
class Solution {
    public int thirdMax(int[] nums) {
       
        Arrays.sort(nums);
        if(nums.length<3){
            return nums[nums.length-1];
        }
        int c=3;
        int m=0;
        for(int i=nums.length-1;i>=0;i--){
            if(i==0){
                c--;
                m=i;
                continue;
            }
            if(nums[i]!=nums[i-1]){
                c--;
            }
            if(c==0){
                return nums[i];
            }
        }
         if(c==0){
                return nums[m];
            }
        
                return nums[nums.length-1];
            
    }
}