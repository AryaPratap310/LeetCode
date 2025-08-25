// Last updated: 25/08/2025, 17:15:28
class Solution {
    public String generateTag(String caption) {
        // String caption="#aRTAF hE@LO HHEHh Arya";
        caption=caption.trim();
		String arr[]=caption.split("\\s+");
		String ans="#";
	            for(int i=0;i<arr.length;i++){
	                String str=arr[i];
	                String check="";
	                for(int j=0;j<str.length();j++) {
	                	if((str.charAt(j)>='a' && str.charAt(j)<='z') ||( str.charAt(j)>='A' && str.charAt(j)<='Z')) {
	                		check+=str.charAt(j);
	                	}
	                }
	                
	                
	                check=check.toLowerCase();
	                if(i!=0) {
	                	String intermediate=(""+check.charAt(0)).toUpperCase();
	                	
	                	ans+=intermediate+check.substring(1,check.length());
	                }
	                else {
	                	ans+=check;	                
	                }
 
	            }
	            if(ans.length()>100){
		            ans=(ans.substring(0,100));
		                return ans;
		            }
		           return ans;
    }
}