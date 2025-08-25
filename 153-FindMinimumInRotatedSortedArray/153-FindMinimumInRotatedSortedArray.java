// Last updated: 25/08/2025, 17:21:51
class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        
        while(low<high){
            int m=low+(-low+high)/2;
            if(nums[m]>nums[high]){
                low=m+1;
            }
            else{
                high=m;
            }
        }
        return nums[low];
    }
}