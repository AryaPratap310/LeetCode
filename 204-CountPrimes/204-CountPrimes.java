// Last updated: 25/08/2025, 17:21:34
class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        return primesieve(n);
		
    }
    public static int primesieve(int n) {
		boolean [] ans=new boolean[n];
		ans[0]=ans[1]=true;
		for(int i=2;i*i<=ans.length;i++) {
			if(ans[i]==false) {
				for(int j=2;i*j<n;j++) {
					ans[i*j]=true;
				}
			}
		}
		int c=0;
		for(int i=0;i<n;i++) {
			if(ans[i]==false) {
				c++;
			}
		}
		return c;
	}
}