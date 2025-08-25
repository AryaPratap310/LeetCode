// Last updated: 25/08/2025, 17:20:31
class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0 && s.substring(0, i).repeat(n / i).equals(s)) {
                return true;
            }
        }
        return false;


        // String doubled = s + s;
        // String sub = doubled.substring(1, doubled.length() - 1);
        // return sub.contains(s);
    }
}