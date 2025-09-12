// Last updated: 12/09/2025, 10:39:48
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length<=k){
            // for(int i=0;i<nums.length;i++){
            //     for(int j=)
            // }
            k=nums.length-1;
        }
        for(int i=0;i<nums.length-k && k>0;){
            for(int j=i+1;j<=i+k;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
            i++;
            if(i+k>nums.length-1){
                k--;
            }
        }
        return false;
    }
}