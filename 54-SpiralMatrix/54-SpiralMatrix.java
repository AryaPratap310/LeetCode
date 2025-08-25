// Last updated: 25/08/2025, 17:22:46
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int minc=0;
        int maxc=matrix[0].length-1;
        int minr=0;
        int maxr=matrix.length-1;
        int te= matrix.length*matrix[0].length;
        int arr[]=new int[(maxr+1)*(maxc+1)];
        int c=0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        while(c<te) {
        	for(int i=minc;i<=maxc && c<te;i++){
                a.add(matrix[minr][i]);
                // System.out.print(matrix[minr][i]+" ");
                c++;
            }
            minr++;
            for(int i= minr;i<=maxr && c<te;i++) {
                a.add(matrix[i][maxc]);
            	//System.out.print(matrix[i][maxc]+" ");
            	c++;
            }
            maxc--;
            
            for(int i=maxc;i>=minc && c<te;i--) {
                a.add(matrix[maxr][i]);
            	//System.out.print(matrix[maxr][i]+" ");
            	c++;
            }
            maxr--;
            for (int i=maxr;i>=minr && c<te;i--) {
                a.add(matrix[i][minc]);
            	//System.out.print(matrix[i][minc]+" ");
            	c++;
            }
            minc++;
        }
        return a;

    }
}