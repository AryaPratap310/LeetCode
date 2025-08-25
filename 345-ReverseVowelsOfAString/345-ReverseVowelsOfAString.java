// Last updated: 25/08/2025, 17:20:58
class Solution {
    public String reverseVowels(String s) {
// String s = "IceCreAm";
		String ansstring="";
		int si=0;
	    int e=s.length()-1;
	    char [] ans=new char[s.length()];
	    while(si<=e) {
	    	while(si<e && (s.charAt(si)!='a'&& s.charAt(si)!='e' && s.charAt(si)!='i'&& s.charAt(si)!='o'&& s.charAt(si)!='u' && s.charAt(si)!='A'&&s.charAt
            (si)!='E' && s.charAt(si)!='I'&& s.charAt(si)!='O' && s.charAt(si)!='U')) {
	    		ans[si]=s.charAt(si);
	    		si++;
	    	}
	    	while(si<e && (s.charAt(e)!='a'&& s.charAt(e)!='e' && s.charAt(e)!='i'&& s.charAt(e)!='o'&& s.charAt(e)!='u' && s.charAt(e)!='A'&&s.charAt(e)
            !='E' && s.charAt(e)!='I'&& s.charAt(e)!='O' && s.charAt(e)!='U')) {
	    		ans[e]=s.charAt(e);
//	    		System.out.println("e "+ans[e]);
	    		e--;
	    	}
	    	char ch1=s.charAt(si);
//	    	System.out.println("ch1 "+ch1);
	    	ans[si]=s.charAt(e);
//	    	System.out.println("ans "+ans[si]);
	    	ans[e]=ch1;
	    	si++;
	    	e--;

	    }
	    for(int i=0;i<ans.length;i++) {
	    	ansstring+=ans[i];
	    }
	    return ansstring;  
    }
}