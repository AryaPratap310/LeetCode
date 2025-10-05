class Solution {
    public int uniquePaths(int m, int n) {
        int [][]dp=new int[m+1][n+1];
        for(int []x:dp){
            Arrays.fill(x,-1);
        }
        return count(0,0,m,n,dp);
    }
    public int count(int i,int j, int m,int n,int[][]dp){
        
        if(i>m-1 || j>n-1){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        dp[i][j+1]=count(i,j+1,m,n,dp);
        dp[i+1][j]=count(i+1,j,m,n,dp);
        return dp[i][j+1]+dp[i+1][j];
    }
}