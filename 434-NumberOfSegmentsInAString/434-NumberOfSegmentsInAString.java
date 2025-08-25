// Last updated: 25/08/2025, 17:20:40
class Solution {
    public int countSegments(String s) {
        if (s.length()==0)
        return 0;
        String arr[] = s.split(" +");
        int l=arr.length;
        if(l!=0 && arr[0]==""){
            return l-1;
        }
        return l;
    }
}