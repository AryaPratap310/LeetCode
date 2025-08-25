// Last updated: 25/08/2025, 17:22:37
class Solution {
    public int climbStairs(int n) {
        int a=0;
        int b=1;
        int s=0;
        for(int i=1;i<=n;i++){
            s=a+b;
            a=b;
            b=s;
        }
        return s;
    }
}