// Last updated: 25/08/2025, 17:22:06
class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            char m = chars[i];
            while (!((m >= 'a' && m <= 'z') || (m >= 'A' && m <= 'Z') || (m >= '0' && m <= '9'))) {
                i++;
                m = chars[i];
                if (i >= j)
                    return true;
                
            }
            char n = chars[j];
            while (!((n >= 'a' && n <= 'z') || (n >= 'A' && n <= 'Z') || (n >= '0' && n <= '9'))) {

                j--;
                n = chars[j];
                if (j <= i)
                    return true;
                ;
                
            }
            if (toLower(m) != toLower(n)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static char toLower(char c) {
        if (c >= 'A' && c <= 'Z') {

            return (char) (c - 'A' + 'a');
        }
        return c;
    }

}
