// Last updated: 25/08/2025, 17:20:56
class Solution {
    public boolean isPerfectSquare(int num) {
        long l=1;
        long h=num;
        while(l<=h){
            long m=l+(h-l)/2;
            if(m*m==num){
                return true;
            }
            else if(m*m<num){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return false;
    }
}