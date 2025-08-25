// Last updated: 25/08/2025, 17:20:27
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        ArrayList<Character> ll=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='-'){
                ll.add(s.charAt(i));
            }
        }
        String ans="";
        int rem=ll.size()%k;
        System.out.println(ll);
        for(int i=0;i<rem;i++){
            char ch=ll.get(i);
            if(ch>='a' && ch<='z'){
                ch-=32;
            }
            ans+=ch;
        }
        if(k<ll.size() && ans.length()!=0){
            ans+="-";
        }
        int count=0;
        for(int i=rem;i<ll.size();i++){
            if(count%k==0 && count!=0){
                ans+="-";
            }
            count++;
            char ch=ll.get(i);
            if(ch>='a' && ch<='z'){
                ch-=32;
            }
            
            ans+=ch;
        }
        System.out.println(ans);
        return ans;
    }
}