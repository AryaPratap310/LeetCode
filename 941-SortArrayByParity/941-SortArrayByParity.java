// Last updated: 25/08/2025, 17:19:13
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            while(l<r && nums[l]%2==0){
                l++;
            }
            if(nums[r]%2==0){
                //even at r
                //swap
                int temp=nums[r];
                nums[r]=nums[l];
                nums[l]=temp;
                l++;
                r--;
            }
            else{
                r--;
            }
        }
        return nums;
    }
}