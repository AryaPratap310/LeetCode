// Last updated: 25/08/2025, 17:15:42
class Solution {
    public String smallestNumber(String pattern) {
        String S= construct(pattern);
        return S;
    }
    public static String construct(String str) {
		int ans[]=new int[str.length()+1];
		int c=1;
		Stack<Integer> st= new Stack<>();
		for(int i=0;i<=str.length();i++) {
			if(i==str.length() || str.charAt(i)=='I') {
				ans[i]=c;
				c++;
				while(!(st.isEmpty())) {
					ans[st.pop()]=c;
					c++;
				}
			}
			else {
				st.push(i);
			}
		}
		String S="";
		for(int x:ans) {
			S+=x;
		}
		return S;
	}
}