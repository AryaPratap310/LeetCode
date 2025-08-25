// Last updated: 25/08/2025, 17:19:11
class Solution {
    public String reverseOnlyLetters(String str) {
       char ch[]=new char[str.length()];
		int si=0;
		int ei=str.length()-1;
		reverse(str,ch,si,ei);
		String ans="";
		for(char x:ch) {
			ans+=x;	
		}
		return ans;

    }
  public static void reverse(String str,char[] ch,int si,int ei) {
		while(si<=ei) {
			while(si<ei && !((str.charAt(si)>='a' && str.charAt(si)<='z')||(str.charAt(si)>='A' && str.charAt(si)<='Z') )  ) {
				ch[si]=str.charAt(si);
				si++;
			}
			while(si<ei && !((str.charAt(ei)>='a' && str.charAt(ei)<='z')||(str.charAt(ei)>='A' && str.charAt(ei)<='Z') )  ) {
				ch[ei]=str.charAt(ei);
				ei--;
			}
			char excha=str.charAt(ei);
			ch[ei]=str.charAt(si);
			ch[si]=excha;
			si++;
			ei--;
		}
	}
}