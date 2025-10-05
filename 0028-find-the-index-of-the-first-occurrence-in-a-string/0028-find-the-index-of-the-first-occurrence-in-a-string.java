class Solution {
    public int strStr(String haystack, String needle) {
        int len=needle.length();
        int len2=haystack.length();
        for(int i=0;i<=len2-len;i++){
            if(haystack.substring(i,i+len).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}