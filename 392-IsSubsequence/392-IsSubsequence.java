// Last updated: 25/08/2025, 17:20:50
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        if (t.length() == 0) {
            return false;
        }
        int  i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
            if(i==s.length()){
                return true;
            }
        }
        return false;
    }
}