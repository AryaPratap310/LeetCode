// Last updated: 25/08/2025, 17:20:53
class Solution {
    public int firstUniqChar(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }        
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
        
        
        
        // char arr[]=s.toCharArray();
        // HashMap<Character,Integer> hashm=new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     hashm.put(arr[i],hashm.getOrDefault(arr[i],0)+1);

        // }
        // for(int i=0;i<arr.length;i++){
        //     if(hashm.get(arr[i])==1){
        //         return i;
        //     }
        // }
        // return -1;
    }
}