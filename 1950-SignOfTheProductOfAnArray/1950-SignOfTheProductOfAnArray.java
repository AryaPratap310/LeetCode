// Last updated: 25/08/2025, 17:16:38
class Solution {
  public int arraySign(int[] nums) {
    var sign = 1;

    for (var n : nums) {
      if (n == 0) return 0;
      sign *= n > 0 ? 1 : -1;
    }
    return sign;
  }
}