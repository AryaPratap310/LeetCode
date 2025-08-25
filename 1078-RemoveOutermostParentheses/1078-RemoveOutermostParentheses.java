// Last updated: 25/08/2025, 17:18:48
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int open = 0; // balance factor
        for(char c : s.toCharArray()){
            if(c == '('){
                if(open > 0){
                    result.append(c); //skip outermost (
                }
                open++;
            }
            else if(c == ')'){
                open--;
                if(open > 0){
                    result.append(c);//skip outermost )
                }
            }
        }
        return result.toString();
    }
}