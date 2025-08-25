// Last updated: 25/08/2025, 17:22:03
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int t=0;
        for(int i=0;i<gas.length;i++){
            t+= (gas[i]-cost[i]);
        }
        if(t<0){
            return -1;
        }
        int idx=0;
        int curr=0;
        for(int i=0;i<cost.length;i++){
            curr+=gas[i]-cost[i];
            if(curr<0){
                curr=0;
                idx=i+1;
            }
        }
        return idx;
    }
}