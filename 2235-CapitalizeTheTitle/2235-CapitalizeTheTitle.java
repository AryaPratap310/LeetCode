// Last updated: 25/08/2025, 17:15:59
class Solution {
        public String capitalizeTitle(String title) {
        List<String> ans = new ArrayList<>();
        for (String w : title.split(" ")) {
            if (w.length() < 3) {
                ans.add(w.toLowerCase());
            }else {
                char[] ca = w.toLowerCase().toCharArray();
                ca[0] ^= 32; // toggle letter case.
                ans.add(String.valueOf(ca));
            }
        }
        return String.join(" ", ans);
    }
}