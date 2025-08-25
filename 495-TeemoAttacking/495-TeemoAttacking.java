// Last updated: 25/08/2025, 17:20:25
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        
        // if (timeSeries.length == 0)
        //     return 0;

        int noOfSecond = duration;

        for (int i=1; i<timeSeries.length; i++) {

            noOfSecond += duration;

            int attacksTime = timeSeries[i] - timeSeries[i-1];

            if (attacksTime <= duration) {
                int diff = duration - attacksTime;
                noOfSecond -= diff;
            }
        }
        return noOfSecond;
    }
}