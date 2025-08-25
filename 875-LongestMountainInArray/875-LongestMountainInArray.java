// Last updated: 25/08/2025, 17:19:24
class Solution {
    public int longestMountain(int[] arr) {
       int ans=0;
        for(int i=0;i<arr.length-1;){
            while(i<arr.length-1 && arr[i]==arr[i+1]) {
            	i++;
            }
            int inc=0;
            int dec=0;
            //increasing mountain
            while(i<arr.length-1 && arr[i]<arr[i+1]) {
            	inc++;
            	i++;
            }
//            decreasing mountain
            while(i<arr.length-1 && arr[i]>arr[i+1]) {
            	dec++;
            	i++;
            }
            if(inc>0 && dec>0) {
            	ans=Math.max(ans, inc+dec+1);
            }
        }
        return ans;
    }
}