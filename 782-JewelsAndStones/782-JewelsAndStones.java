// Last updated: 25/08/2025, 17:19:36
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(char c:stones.toCharArray()){
            if(jewels.indexOf(c)!=-1)count++;
        }
        return count;
    }
}