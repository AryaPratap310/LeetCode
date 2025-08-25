// Last updated: 25/08/2025, 17:16:40
class Solution {
    public int numDifferentIntegers(String word) {
        String[] arr = word.replaceAll("[a-zA-Z]", " ").split("\\s+");
        Set<String> set = new HashSet<String>();
            
        for (String str : arr) {
            if (!str.isEmpty())
                set.add(String.valueOf(str.replaceAll("^0*","")));
        }
                
        return set.size();
    }
}