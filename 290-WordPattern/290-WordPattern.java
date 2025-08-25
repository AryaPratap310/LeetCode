// Last updated: 25/08/2025, 17:21:07
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String arr[]=s.split(" ");
		if(pattern.length()!=arr.length) {
			return false;
		}
		Map<Character,String> CharString=new HashMap<>();
		Map<String,Character> StringChar=new HashMap<>();
		for(int i=0;i<pattern.length();i++) {
			char ch=pattern.charAt(i);
			String str=arr[i];
			
			if(!CharString.containsKey(ch)) {
				CharString.put(ch,str);
//				System.out.println(CharString.get(ch));

			}
			if(!StringChar.containsKey(str)) {
				StringChar.put(str,ch);
//				System.out.println(StringChar.get(str));
			}
			if(!CharString.get(ch).equals(str) || !StringChar.get(str).equals(ch)) {
				return false;
			}
			
		}
		return true;

    }
}