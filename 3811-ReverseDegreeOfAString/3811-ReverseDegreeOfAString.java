// Last updated: 25/08/2025, 17:15:34
class Solution {
    public int reverseDegree(String s) {
        int sum=0;
		 for(int i=0;i<s.length();i++) {
			 int a=123-s.charAt(i);
			 sum=sum+(i+1)*a;
			 // System.out.println(sum);
		 }
        return sum;
    }
}