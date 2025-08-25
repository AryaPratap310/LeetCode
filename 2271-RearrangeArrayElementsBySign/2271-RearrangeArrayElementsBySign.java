// Last updated: 25/08/2025, 17:15:54
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        // int even[]=new int[n/2];
        // int odd[]=new int[n/2];
        int ans[]=new int[n];
        int i=0;
        int j=1;
        for(int k=0;k<n; k++){
            if(nums[k]>0){
                ans[i]=nums[k];
                i+=2;
            }
            else if(j<n){
                ans[j]=nums[k];
                j+=2;
            }
        }
        return ans;
    }
}