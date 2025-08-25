// Last updated: 25/08/2025, 17:22:40
class Solution {
    public String addBinary(String a, String b) {
       int i=a.length()-1;
		int j=b.length()-1;
		int pc=0;
//		int nc=0;
		Stack<Integer> st=new Stack<>();
		while(i>=0 && j>=0) {
			if(a.charAt(i)-'0'+b.charAt(j)-'0'+pc==0) {
				st.push(0);
//				pc=nc;
				pc=0;
			}
			else if(a.charAt(i)-'0'+b.charAt(j)-'0'+pc==1) {
				 st.push(1);
				 pc=0;
			}
			else if(a.charAt(i)-'0'+b.charAt(j)-'0'+pc==2) {
				st.push(0);
				pc=1;
			}
			else {
				st.push(1);
				pc=1;
			}
			i--;
			j--;
			
		}
		while(i>=0) {
			if(a.charAt(i)-'0'+pc==0) {
				st.push(0);
//				pc=nc;
				pc=0;
			}
			else if(a.charAt(i)-'0'+pc==1) {
				 st.push(1);
				 pc=0;
			}
			else if(a.charAt(i)-'0'+pc==2) {
				st.push(0);
				pc=1;
			}
			else {
				st.push(1);
				pc=1;
			}
			i--;
		}
		while(j>=0) {
			if(b.charAt(j)-'0'+pc==0) {
				st.push(0);
//				pc=nc;
				pc=0;
			}
			else if(b.charAt(j)-'0'+pc==1) {
				 st.push(1);
				 pc=0;
			}
			else if(b.charAt(j)-'0'+pc==2) {
				st.push(0);
				pc=1;
			}
			else {
				st.push(1);
				pc=1;
			}
			j--;
		}
		if(pc==1) {
			st.push(1);
		}
		String ans="";
		while(!st.isEmpty()) {
			ans+=st.pop();
		}
		return ans;
 
    }
}