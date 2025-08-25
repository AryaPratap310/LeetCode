// Last updated: 25/08/2025, 17:18:27
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int frontSum=0;
        int backSum=0;
        for(int i=start;i!=destination;i=(i+1)%distance.length) frontSum+=distance[i];
        for(int i=destination;i!=start;i=(i+1)%distance.length) backSum+=distance[i];
        return Math.min(frontSum,backSum);
    }
}
// Please upvote if you like the solution \U0001f64f