// Last updated: 25/08/2025, 17:17:55
class Solution {
    public List<String> stringMatching(String[] words) {
        String str = String.join(" ", words);
        List<String> res = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(str.indexOf(words[i]) != str.lastIndexOf(words[i])){
                res.add(words[i]);
            }
        }
        return res;
    }
}