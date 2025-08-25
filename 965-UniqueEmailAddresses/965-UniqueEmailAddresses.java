// Last updated: 25/08/2025, 17:19:08
class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> ans=new HashSet<>();
        for(String s:emails){
            ans.add(filter(s));
        }
        return ans.size();
    }
    public String filter(String s){
        int index=  s.indexOf('@');
        StringBuilder sb=new StringBuilder(s.length());
        for(int i=0;i<index;i++){
            char ch=s.charAt(i);
            if(ch=='+')break;
            if(ch!='.')sb.append(ch);
        }
        sb.append(s.substring(index));
        return sb.toString();
    }
}