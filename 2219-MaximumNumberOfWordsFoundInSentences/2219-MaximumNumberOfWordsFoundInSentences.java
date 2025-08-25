// Last updated: 25/08/2025, 17:16:04
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLen = 0;
		
        for (String currSent : sentences) {
            int currLen = currSent.split(" ").length;
            if (maxLen < currLen)
                maxLen = currLen;
        }
        return maxLen;
    }
}