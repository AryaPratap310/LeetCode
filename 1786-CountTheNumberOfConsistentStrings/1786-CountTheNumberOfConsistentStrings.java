// Last updated: 25/08/2025, 17:17:05
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
	int count = words.length;
	int[] store = new int[26];

	for (char c : allowed.toCharArray()){
		store[c-'a']++;
	}

	for (String word : words) {
		
		for (char c : word.toCharArray()) {
			if (store[c-'a'] <= 0){
				count--;
				break;
			}
		}
	}
	return count;
}
}