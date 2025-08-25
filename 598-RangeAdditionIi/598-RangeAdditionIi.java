// Last updated: 25/08/2025, 17:19:59
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int max = m>n ? m : n;
        int i = 0, j = 0, min1 = max, min2 = max, row = ops.length;
        if(ops.length == 0) return m*n;
        else if(m == n || ops.length == 1) return ops[0][0]*ops[0][1];
        else {
            for(i = 0; i < row; i++) {
                
                if(ops[i][j] < min1) min1 = ops[i][j];

                if(ops[i][j+1] < min2) min2 = ops[i][j+1]; 
            } 
        }
        return min1*min2;
       
    }
}