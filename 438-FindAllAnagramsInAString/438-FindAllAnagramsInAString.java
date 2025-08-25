// Last updated: 25/08/2025, 17:20:38
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // corner case
        if (s == null || p == null || s.length() < p.length()) return new ArrayList<Integer>();

        List<Integer> result = new ArrayList<>();

        // initialize needed & sliding window
        Map<Character, Integer> needed = new HashMap<>();
        int numValid = 0;

        for (int i = 0; i < p.length(); i++) {
            char element = p.charAt(i);
            needed.put(element, needed.getOrDefault(element, 0) + 1);
        }    

        // moving window
        for (int right = 0; right < s.length(); right++) {
            // add right
            char rightKey = s.charAt(right);
            if (needed.containsKey(rightKey)) {
                needed.put(rightKey, needed.get(rightKey) - 1);

                // upate numValid
                if (needed.get(rightKey) == 0) numValid++;
            }

            // remove previous left
            if (right >= p.length()) {
                char prevLeftKey = s.charAt(right - p.length());
                if (needed.containsKey(prevLeftKey)) {
                    needed.put(prevLeftKey, needed.get(prevLeftKey) + 1);
                    // update numValid
                    if (needed.get(prevLeftKey) == 1) numValid--;
                }
            }

            // update result
            if (numValid == needed.size()) {
                result.add(right - p.length() + 1);
            }
        }

        return result;
    }
}