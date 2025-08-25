// Last updated: 25/08/2025, 17:20:43
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder str = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1;
            if (i >= 0) {
                digit1 = num1.charAt(i) - '0';
                i--;
            } 
            else {
                digit1 = 0;
            }
            int digit2;
            if (j >= 0) {
                digit2 = num2.charAt(j) - '0';
                j--;
            } 
            else {
                digit2 = 0;
            }
            int sum = digit1 + digit2 + carry;
            int newDigit = sum % 10;
            carry = sum / 10;
            str.append(newDigit);
        }
        str.reverse(); 
        return str.toString();
    }
}