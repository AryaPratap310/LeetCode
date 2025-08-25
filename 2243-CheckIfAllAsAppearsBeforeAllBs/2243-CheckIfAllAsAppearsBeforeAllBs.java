// Last updated: 25/08/2025, 17:15:57
class Solution {
        public boolean checkString(String s) {
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i - 1) == 'b' && s.charAt(i) == 'a') {
                return false;
            }
        }
        return true;
    }
}