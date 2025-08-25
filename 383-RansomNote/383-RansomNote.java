// Last updated: 25/08/2025, 17:20:55
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()){
            return false;
        }
        int [] az=new int[26];
        for(int i=0;i<magazine.length();i++){
            az[magazine.charAt(i)-'a']++;
        }
        for(int j=0;j<ransomNote.length();j++){
            if(--az[ransomNote.charAt(j)-'a']<0){
                return false;
            }
        }
        return true;

    }
}