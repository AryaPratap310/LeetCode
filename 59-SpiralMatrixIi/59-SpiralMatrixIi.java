// Last updated: 25/08/2025, 17:22:44
class Solution {
    public int[][] generateMatrix(int n) {
        int minc=0;
        int minr=0;
        int maxc=n-1;
        int maxr=n-1;
        int c=1;
        int [][] m =new int[n][n];
        while(c<=n*n){
            for(int i=minc;i<=maxc && c<=n*n;i++){
                m[minr][i]=c;
                c++;
            }
            minr++;
            for(int i=minr;i<=maxr && c<=n*n;i++){
                m[i][maxc]=c;
                c++;
            }
            maxc--;
            for(int i=maxc;i>=minc && c<=n*n;i--){
                m[maxr][i]=c;
                c++;
            }
            maxr--;
            for(int i=maxr;i>=minr && c<=n*n;i--){
                m[i][minc]=c;
                c++;
            }
            minc++;
            // for(int i=minc;i<=maxc && c<=n*n;i++){
            //     m[minr][i]=c;
            //     c++;
            // }
            // minr++;

        }
        return m;
    }
}