// Last updated: 25/08/2025, 17:21:29
class Solution {
    public boolean containsDuplicate(int[] nums) {
       
        // int len=nums.length;
        // Set<Integer> set = new HashSet<>();
        // for(int i=0;i<len;i++){
        //     set.add(nums[i]);
        // }
        // if(len==set.size()){
        //     return false;
        // }
        // return true;
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}