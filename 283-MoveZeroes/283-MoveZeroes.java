// Last updated: 25/08/2025, 17:21:09
class Solution {
    public void moveZeroes(int[] nums) {
        int start=0;
        int len=nums.length-1;
        int [] arr=new int[len+1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[start++]=nums[i];
                
                
            }    
        }
        for(int j=0;j<=len;j++){
                nums[j]=arr[j];
            }
        
    }
}
