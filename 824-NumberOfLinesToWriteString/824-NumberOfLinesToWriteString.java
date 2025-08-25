// Last updated: 25/08/2025, 17:19:31
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int row=1;
        int linelength=0;
        int arr[]={0,0};
        for(int i=0;i<s.length();i++){
            if(linelength+widths[s.charAt(i)-'a']<=100){
                linelength+=widths[s.charAt(i)-'a'];
            }
            else{
                row++;
                linelength=widths[s.charAt(i)-'a'];
            }
        }
        arr[0]=row;
        arr[1]=linelength;
        return arr;

    }
}