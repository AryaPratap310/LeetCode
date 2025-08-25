// Last updated: 25/08/2025, 17:16:17
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int words = 0;
        for(int i = 0; i < patterns.length; i++) if(word.contains(patterns[i])) words++;
        return words;
    }
}