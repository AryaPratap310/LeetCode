// Last updated: 25/08/2025, 17:20:52
class Solution {
    public char findTheDifference(String s, String t){
        
        
        
        
        
        int [] arr=new int[26];
        char ans;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            if(arr[t.charAt(i)-'a']==0){
                return t.charAt(i);
            }
            else{
                arr[t.charAt(i)-'a']--;
            }
        }
        // return 'a';
        throw new IllegalArgumentException();
    }
}