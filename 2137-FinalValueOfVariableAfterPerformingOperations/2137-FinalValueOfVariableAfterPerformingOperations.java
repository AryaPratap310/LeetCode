// Last updated: 25/08/2025, 17:16:13
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String o : operations) x += (44 - o.charAt(1));
        return x;
    }
}