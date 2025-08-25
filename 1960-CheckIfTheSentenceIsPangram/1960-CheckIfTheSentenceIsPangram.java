// Last updated: 25/08/2025, 17:16:36
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] letters  = new boolean[26];
        
        for(char c : sentence.toCharArray()) {
            letters[c - 'a'] = true;
        }
        
        //find any letter that not exist
        for(boolean existLetter : letters) {
            if(!existLetter) return false;
        }
        
        return true;
    }
}