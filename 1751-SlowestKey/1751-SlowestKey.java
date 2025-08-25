// Last updated: 25/08/2025, 17:17:11
class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char ans = keysPressed.charAt(0);
        int max = releaseTimes[0];
        for(int i = 1; i< releaseTimes.length  ;i++){
           
                int diff = Math.abs(releaseTimes[i - 1] -releaseTimes[i]);
                 if (diff > max || (diff == max && keysPressed.charAt(i) > ans)) {
                max = diff;
                ans = keysPressed.charAt(i);
            }
        }
        return ans;
    }
}