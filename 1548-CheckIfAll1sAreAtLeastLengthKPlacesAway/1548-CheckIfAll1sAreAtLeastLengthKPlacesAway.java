// Last updated: 25/08/2025, 17:17:47
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count=0,flag=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(count<k && flag==1)
                    return false;
                count=0;
                flag=1;
            }
            else
                count++;
        }
        return true;
    }
}