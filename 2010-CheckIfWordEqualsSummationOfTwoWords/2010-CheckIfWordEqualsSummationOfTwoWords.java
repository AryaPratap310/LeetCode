// Last updated: 25/08/2025, 17:16:26
class Solution {
    public int helper(String word) {
        int ans = 0;
        for (int i = 0; i < word.length(); ++i)
            ans = ans * 10 + word.charAt(i) - 'a';
        return ans;
    }
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return helper(firstWord) + helper(secondWord) == helper(targetWord);
    }
}