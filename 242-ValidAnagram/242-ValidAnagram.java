// Last updated: 28/08/2025, 10:51:34
class Solution {
    public boolean isAnagram(String s, String t) {
        // method  1
        int arr[]=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            arr[ch-'a']--;
        }

        for(int x:arr){
            if(x!=0){
                return false;
            }
        }
        return true;


        // method  2

        // if(s.length()!=t.length()){
        //     return false;
        // }
        // HashMap<Character,Integer> check=new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     check.put(s.charAt(i),check.getOrDefault(s.charAt(i),0)+1);
        // }

        // for(int i=0;i<t.length();i++){
        //     if(!check.containsKey(t.charAt(i)) || check.get(t.charAt(i))==0){
        //         return false;
        //     }
        //     check.put(t.charAt(i),check.get(t.charAt(i))-1);
        // }
        // return true;

        // method  3

        // char[] sChars = s.toCharArray();
        // char[] tChars = t.toCharArray();
        
        // Arrays.sort(sChars);
        // Arrays.sort(tChars);
        
        // return Arrays.equals(sChars, tChars);  
    }
}