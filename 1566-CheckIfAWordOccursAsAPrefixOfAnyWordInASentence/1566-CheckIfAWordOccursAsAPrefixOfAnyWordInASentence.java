// Last updated: 25/08/2025, 17:17:43
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");               
        int n=arr.length;
        
        for(int i=0; i<n; i++){
            if(arr[i].startsWith(searchWord)){                
                return i+1;
            }
        }

        return -1;
    }
}