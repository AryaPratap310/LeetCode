// Last updated: 25/08/2025, 17:18:56
class Solution {
    public int[] sortedSquares(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;
        int l=0;
        int r=nums.length-1;
        int r2=nums.length-1;
        int arr[]=new int[r+1];
        while(l<=r){
            int left=nums[l]*nums[l];
            int right=nums[r]*nums[r];
            if(left>right){
                arr[r2]=left;
                r2--;
                l++;
            }
            else{
                arr[r2]=right;
                r2--;
                r--;
            }
        }
        return arr;
    }
}