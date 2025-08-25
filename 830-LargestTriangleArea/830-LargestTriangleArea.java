// Last updated: 25/08/2025, 17:19:29
class Solution 
{
    public double largestTriangleArea(int[][] points) //fastest approach
    {
        int n = points.length;
        double max =0;

        for(int i =0; i<n; i++)
            for(int j =i+1; j<n; j++)
                for(int k =j+1; k<n; k++)
                {
                    double area =0;
                    int[] a=points[i];
                    int[] b=points[j];
                    int[] c=points[k];
                    area=Math.abs(area(a,b)+area(b,c)+area(c,a));
                    if(area>max)
                        max=area;
                }
        return max;
    }

    public double area(int[] a, int[] b)
    {
        int l = b[0]-a[0];
        double h = (a[1]+b[1]+200)/2.0;
        return l*h;
    }
}