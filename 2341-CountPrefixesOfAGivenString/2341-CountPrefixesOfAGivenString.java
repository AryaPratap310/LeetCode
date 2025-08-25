// Last updated: 25/08/2025, 17:15:51
class Solution {
    public int countPrefixes(String[] words, String s) {
        return (int) Arrays.stream(words).filter(s::startsWith).count();
    }
}