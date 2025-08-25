// Last updated: 25/08/2025, 17:22:45
class Solution {
    public int lengthOfLastWord(String s) {
        String arr []= s.split(" ");
        return arr[arr.length-1].length();
    }
}