// Last updated: 25/08/2025, 17:19:40
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(letters[letters.length-1]<=target){
            return letters[0];
        }
        else{
            for(int i=0;i<letters.length;i++){
                if(letters[i]>target){
                    return letters[i];
                }
            }
        }
        return letters[0];
    }
}