// Last updated: 25/08/2025, 17:19:22
class Solution {
    public int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int [][]t=new int[col][row];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               t[j][i]=matrix[i][j];
                
                
            }
        }
        return t;
    }
}