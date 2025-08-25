// Last updated: 25/08/2025, 17:21:47
class Solution {
    public int findPeakElement(int[] nums) {
        // if(nums.length==2){
        //     if(nums[0]>nums[1]){
        //         return 0;
        //     }
        //     else{
        //         return 1;
        //     }
        // }
        for(int i=1;i<nums.length;i++){
            // if(i+1==nums.length){
            //     if(nums[i]>nums[i-1] && (nums[i]>nums[i+1] || nums[i]>0)){
            //         return i;
            //     }
            // }
            if(i==nums.length-1){
               if(nums[i]>nums[i-1]){
                return i;
               }
            }
            else if(nums[i]>nums[i-1] && (nums[i]>nums[i+1] )){
                return i;
            }
        }
        return 0;
    }
}