// Last updated: 25/08/2025, 17:15:35
class Solution {
    public String findValidPair(String s) {
        char ch[]=s.toCharArray();
        int arr[]=new int[10];
        String ans="";
        for(int i=0;i<s.length();i++){

                arr[ch[i]-'0']=arr[ch[i]-'0']+1;

        }

        for(int i=0;i<s.length()-1;i++){
        	
        	
        	if(ch[i]-'0'!=ch[i+1]-'0') {

        		if(ch[i]-'0'==arr[ch[i]-'0']  && ch[i+1]-'0'==arr[ch[i+1]-'0']) {
        			ans=ans+s.charAt(i)+s.charAt(i+1);
                    return ans;
        		}		
        	}
        }
        
        return ans;
    }
}