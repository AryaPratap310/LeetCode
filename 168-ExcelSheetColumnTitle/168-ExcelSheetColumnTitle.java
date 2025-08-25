// Last updated: 25/08/2025, 17:21:44
class Solution {
    public String convertToTitle(int columnnumber) {
        StringBuilder res=new StringBuilder();
        while(columnnumber>0){
            columnnumber--;
            res.append((char)(columnnumber%26 +'A'));
            columnnumber/=26;
        }
        return res.reverse().toString();
    }
}