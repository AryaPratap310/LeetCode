// Last updated: 25/08/2025, 17:16:16
class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder res = new StringBuilder ("");
        for (String word : words) {
            res.append (word);
            if (s.equals (res.toString()))
                return true;
            if (s.indexOf (res.toString()) == -1)
                return false;
        }
        return false;
    }
}