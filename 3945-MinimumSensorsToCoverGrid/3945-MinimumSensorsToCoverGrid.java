// Last updated: 25/08/2025, 17:15:27
class Solution {
    public int minSensors(int n, int m, int k) {
        int side = 2 * k + 1; // coverage side length
        int rows = (n + side - 1) / side; // ceil(n / side)
        int cols = (m + side - 1) / side; // ceil(m / side)
        return rows * cols;
    // }
    }
}