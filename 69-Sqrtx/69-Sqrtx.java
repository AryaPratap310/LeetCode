// Last updated: 25/08/2025, 17:22:39
class Solution {
    public int mySqrt(int x) {
        int l=1;
        int h=x/2;
        if(x==0 || x==1){
            return x;
        }
        else{
            
            while(l<=h){
                int mid=l+(h-l)/2;
                if((long)mid*mid>(long)x){
                    h=mid-1;
                }
                
                else if((long)mid*mid==(long)x){
                    return mid;
                }
                else{
                    l=mid+1;
                }
            }
        }
        return Math.round(h);
    }
}