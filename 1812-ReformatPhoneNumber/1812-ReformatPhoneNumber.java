// Last updated: 25/08/2025, 17:17:00
class Solution {
   public String reformatNumber(String number) {
    return number.replaceAll("\\D", "").replaceAll("...?(?=..)", "$0-");
}
}