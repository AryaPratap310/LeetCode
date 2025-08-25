// Last updated: 25/08/2025, 17:16:21
class Solution {
    public String largestOddNumber(String num) {
        String count="";
        String ans="";
        for(int i=num.length()-1;i>=0;i--){
            int x=num.charAt(i)-'0';
            if(x%2!=0){
                count=num.charAt(i)+count;
                ans+=num.charAt(i);
                // System.out.println(count+"   odd   "+ans);
            }
            else if(ans.length()>0){
                count=num.charAt(i)+count;
                // System.out.println(count+"   even  "+ans);
            }
            // if(count.length()>ans.length()){
            //     // System.out.println(count+"   ans  "+ans);
            //     ans=count;
            //     // System.out.println(count+"   ansnew  "+ans);
            // }
           
        }
        return count;
    }
}