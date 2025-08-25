// Last updated: 25/08/2025, 17:20:19
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.charAt(0)>='A' && word.charAt(0)<='Z'){
            if(word.length()>1){
                if(word.charAt(1)>='A' && word.charAt(1)<='Z'){
                    return allcaps(word);
                }
                else{
                    return firstcap(word);
                }
            }
            else{
                return true;
            }
        }
        else{
            return allsmall(word);
        }
    }
    public static boolean allsmall(String word){
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                System.out.println("all small");
                return false;
            }
        }
        System.out.println("all small");
        return true;
    }
    public static boolean allcaps(String word){
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)<'A' || word.charAt(i)>'Z'){
                System.out.println("all cap");
                return false;
            }
        }
        System.out.println("all cap");
        return true;
    
    }
    public static boolean firstcap(String word){
        for(int i=1;i<word.length();i++){
           if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                System.out.println("1st cap");
                return false;
            }
        }
        System.out.println("1st cap");
        return true;
    
    }
}