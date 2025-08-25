// Last updated: 25/08/2025, 17:17:16
class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }else if(s.charAt(i)==')'){
                count--;
            }
            ans=Math.max(ans,count);
        }
        return ans;



        // method 2

        // Stack<Character> st=new Stack<>();
        // int ans=0;
        
        // for(int i=0;i<s.length();i++){
        //     // System.out.println(s.charAt(i));
        //     if(s.charAt(i)=='(' || s.charAt(i)==')'){
        //         // System.out.println(s.charAt(i));
                
        //         if(s.charAt(i)=='('){
        //             st.push('(');
        //         }
        //         else {
        //             st.pop();
        //         }
        //         ans=Math.max(ans,st.size());
        //     }
        // }
        // return ans;
    }
}