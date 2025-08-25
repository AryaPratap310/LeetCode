// Last updated: 25/08/2025, 17:20:09
class Solution {
    public boolean checkRecord(String s) {
        int abs=0;
        int late=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                abs++;
            }
            if(abs>1){
                return false;
            }
            if(i>1 && s.charAt(i)=='L' && s.charAt(i-1)=='L' &&s.charAt(i-2)=='L'){
                return false;
            }
        }
        return true;
    }
}