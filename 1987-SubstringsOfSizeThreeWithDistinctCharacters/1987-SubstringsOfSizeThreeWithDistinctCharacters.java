// Last updated: 25/08/2025, 17:16:30
class Solution {
    public int countGoodSubstrings(String s) {
        int res = 0;
        
        for(int i = 2 ; i< s.length();i++)
            if(s.charAt(i) != s.charAt(i-1) && s.charAt(i) != s.charAt(i-2)  && s.charAt(i-1) != s.charAt(i-2))
                res++;
        return res;
    }
}