// Last updated: 25/08/2025, 17:20:41
class Solution {
    public int characterReplacement(String s, int k) {
        int arr[]=new int[26];
        int res=0,maxfreq=0,l=0,r=0;
        while(r<s.length()){
            arr[s.charAt(r)-'A']++;
            maxfreq=Math.max(maxfreq,arr[s.charAt(r)-'A']);

            while((r-l+1)-maxfreq>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }

            res=Math.max(res,r-l+1);
            r++;
        }
        return res;
    }
}