// Last updated: 25/08/2025, 17:17:51
class Solution {
    public int maxScore(int[] card, int k) {
        int total=0;
        for(int i=0;i<k;i++){
            total+=card[i];
        }
        int maxsum=total;
        for(int i=k-1,j=card.length-1;  i>=0 ;  i--,j--){
            total+=card[j]-card[i];
            maxsum=Math.max(maxsum,total);
        }
        return maxsum;

    }
}