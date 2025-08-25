// Last updated: 25/08/2025, 17:18:06
class Solution {
       // make a char frequency array of characters and the frequency with that they occur.
    // pick an array index at which count > 0 add it to the result, increment the index until you find the next non zero            count char. add it to result and increment index. keep doing so until you reach the end of array.
    // this was bascially step 2.
    
    //set index to array.length and decremtn index until you find a char with nonzero count; add that to result and keep         //decrementing and adding non zero count chars until you reach 0;
    
    //check if the length of appended string is equal to the original string, if not so repeat the above two steps of 
    //passing in forward direction and then in backward until the length of appended string equals the original.
    
    //return the result
    
    //Time Complexity = O(n)
    //Space Complexity = O(1);
    
    public String sortString(String s) {
        
        int[] charArr = new int[26];
        
        for(int i=0; i<s.length(); i++){
            charArr[s.charAt(i) - 'a']++;            
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(sb.length() != s.length()){
            for(int i=0; i<26; i++){
                if(charArr[i] > 0){
                    sb.append((char) ('a' + i));
                    charArr[i]--;
                }
            }
            
            
            for(int j=25; j>=0; j--){
                if(charArr[j] > 0){
                    sb.append((char) ('a' + j));
                    charArr[j]--;
                }
            }
        }
        
        return sb.toString();
        
    }
}