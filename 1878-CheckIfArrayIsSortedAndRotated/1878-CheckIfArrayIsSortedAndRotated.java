// Last updated: 25/08/2025, 17:16:53
class Solution {
    public boolean check(int[] nums) {
        int c=0;
        int idx=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                c++;
                idx=i;
            }
        }
        if(c==0){
            return true;
        }
        else if(c>1 ){
            return false;
        }
        else if(c<=1 && nums[0]>=nums[nums.length-1]){
            return true;
        }
        return false;
            
    //     rotate(nums,0,idx);
    //     rotate(nums,idx+1,nums.length-1);
    //     rotate(nums,0,nums.length-1);
    //     for(int i=0;i<nums.length-1;i++){
    //         if(nums[i]>nums[i+1]){
    //             return false;
    //         }
    //     }
    //     return true;
        
    // }
    // public static int [] rotate(int [] nums,int s,int e){
    //     while(s<e) {
    //     	int temp=nums[s];
    //         nums[s]=nums[e];
    //         nums[e]=temp;
    //         s++;
    //         e--;
    //     }
    //     return nums;

    }
}