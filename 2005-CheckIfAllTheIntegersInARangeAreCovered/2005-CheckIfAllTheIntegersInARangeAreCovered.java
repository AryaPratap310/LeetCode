// Last updated: 25/08/2025, 17:16:27
class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
    int[] line = new int[52];
    for (var r : ranges) {
        line[r[0]] += 1;
        line[r[1] + 1] -= 1;
    }
    for (int i = 1, overlaps = 0; i <= right; ++i) {
        overlaps += line[i];
        if (i >= left && overlaps == 0)
            return false;
    }
    return true;
}
}