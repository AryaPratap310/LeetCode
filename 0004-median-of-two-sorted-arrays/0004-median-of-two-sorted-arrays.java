class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        if(a.length>b.length){
            int []temp=a;
            a=b;
            b=temp;
        }
        int l=0;
        int h=a.length;
        int total=(a.length+b.length);
        int hf=(total+1)/2;
        while(l<=h){
            int am=(l+h)/2;
            int bm=hf-am;
            int amin=(am==0)?Integer.MIN_VALUE:a[am-1];
            int amax=(am>=a.length)?Integer.MAX_VALUE:a[am];
            int bmin=(bm==0)?Integer.MIN_VALUE:b[bm-1];
            int bmax=(bm>=b.length)?Integer.MAX_VALUE:b[bm];

            if(amin<=bmax && bmin<=amax){
                double ans;
                if(total%2==0){
                    ans=((Math.max(amin,bmin))+Math.min(amax,bmax))/2.0;
                }
                else{
                    ans=Math.max(amin,bmin)/1.0;
                }
                return ans;
            }
            else if(amin>bmax){
                h=am-1;
            }
            else if(bmin>amax){
                l=am+1;
            }

        }
        return -1;
    }
}