// Last updated: 25/08/2025, 17:18:51
class Solution {
    public int longestOnes(int[] nums, int k) {
        int flip=0;
        int si=0;
        int ei=0;
        int ans=0;
        while(ei<nums.length){
            //grow
            if(nums[ei]==0){
                flip++;
            }

            //shrink
            while(flip>k){
                if(nums[si]==0){
                    flip--;
                }
                si++;
            }
            //ans update
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}