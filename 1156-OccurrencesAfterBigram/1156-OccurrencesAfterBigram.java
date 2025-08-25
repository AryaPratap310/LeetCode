// Last updated: 25/08/2025, 17:18:44
class Solution {
   public String[] findOcurrences(String text, String first, String second) {
	var words = text.split(" ");
	var occurrences = new ArrayList<String>();

	for (var i = 0; i + 2 < words.length; i++)
		if (words[i].equals(first) && words[i + 1].equals(second))
			occurrences.add(words[i + 2]);

	return occurrences.toArray(new String[0]);
}
}