// Last updated: 25/08/2025, 17:18:09
class Solution {
    public int numberOfSubstrings(String s) {
        int l=0;
        int [] count=new int[3];
        int ans=0;
        for(int r=0;r<s.length();r++){
            count[s.charAt(r)-'a']++;

            while(count[0]>0 && count[1]>0 &&count[2]>0 ){
                ans+=s.length()-r;
                count[s.charAt(l)-'a']--;
                l++;
            }
        }
        return ans;
    }
}