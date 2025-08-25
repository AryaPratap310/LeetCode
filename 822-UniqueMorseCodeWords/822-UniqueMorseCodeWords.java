// Last updated: 25/08/2025, 17:19:32
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> unique=new HashSet<>();
        for(String s:words){
            unique.add(parseToMorse(s));
        }
        return unique.size();
    }
    public String parseToMorse(String s){
        String[]morse={".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(morse[s.charAt(i) - 'a']);
        }
        return stringBuilder.toString();
    }
}