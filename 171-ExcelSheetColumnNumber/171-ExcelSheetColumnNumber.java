// Last updated: 25/08/2025, 17:21:41
class Solution {
    public int titleToNumber(String ct) {
        int result=0;
        for(int i=0;i<ct.length();i++){
            char ch=ct.charAt(i);
            int value=ch-'A'+1;
            result=result*26+value;
        }
        return result;
    }
}