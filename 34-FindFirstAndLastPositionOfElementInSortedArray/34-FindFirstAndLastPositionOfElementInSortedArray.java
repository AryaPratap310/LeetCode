// Last updated: 25/08/2025, 17:23:03
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr={-1,-1};
        int n=Position(nums,target);
        if(n==nums.length || nums[n]!=target ){
            return arr;
        }    
        else{
            int m=Position(nums,target+1)-1;
            arr[0]=n;
            arr[1]=m;
            return arr;
        }
    }
    public static int Position(int nums[],int target){
        int l=0;
        int h=nums.length;
        while(l<h){
            int mid=l+(h-l)/2;
            if(nums[mid]>=target){
                h=mid;
            }
            else {
                l=mid+1;
            }
        }
        return l;
    }
}