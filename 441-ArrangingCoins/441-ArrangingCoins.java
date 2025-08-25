// Last updated: 25/08/2025, 17:20:37
class Solution {
    public int arrangeCoins(int n) {
        
        long l=1;
        long h=n;
        while(l<=h){
            long mid=l+(h-l)/2;
            if(mid*(mid+1)/2<=n){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return (int)h;
    }
}