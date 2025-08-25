// Last updated: 25/08/2025, 17:19:01
class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> hset=new HashSet<>();
        for(int num:nums)
        {
            if(hset.contains(num))
                return num;
            hset.add(num);
        }
        return -1;

        
    }
}