// Last updated: 25/08/2025, 17:15:33
class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int c=n*n;
        while(true){
            if(c*w<=maxWeight){
                return c;
            }
            c--;
        }
    }
}