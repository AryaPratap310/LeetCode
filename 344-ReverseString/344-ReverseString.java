// Last updated: 25/08/2025, 17:21:00
class Solution {
    public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            char ch=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=ch;
        }
    }
}