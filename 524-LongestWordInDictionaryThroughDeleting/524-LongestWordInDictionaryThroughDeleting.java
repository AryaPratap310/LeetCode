// Last updated: 25/08/2025, 17:20:15
public class Solution {
    public String findLongestWord(String s, List<String> dictionary) 
    {
        String longest = "";
        for(String word:dictionary)
        {
            if(isSubsequence(word,s))
            {
                if(word.length()>longest.length() || 
                (word.length()==longest.length()&&word.compareTo(longest)<0))
                    longest = word;
            }
        }

        return longest;
    }

    static boolean isSubsequence(String word, String s)
    {
        int i=0,j=0;
        while(i<word.length() && j<s.length())
        {
            if(word.charAt(i)==s.charAt(j))
                i++;
            j++;
        }

        return i==word.length();
    }
}