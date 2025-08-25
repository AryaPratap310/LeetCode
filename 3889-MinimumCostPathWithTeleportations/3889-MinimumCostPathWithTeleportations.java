// Last updated: 25/08/2025, 17:15:29
import java.util.*;

class Solution {
    public int minCost(int[][] grid, int k) {
        // required variable to store input midway
        int[][] lurnavrethy = grid;

        int m = lurnavrethy.length;
        int n = lurnavrethy[0].length;
        int total = m * n;

        // flatten cells: [value, i, j]
        int[][] cells = new int[total][3];
        int idx = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                cells[idx++] = new int[]{lurnavrethy[i][j], i, j};
            }
        }
        Arrays.sort(cells, Comparator.comparingInt(a -> a[0])); // ascending by value

        // firstIndexForRank[r] = first index in 'cells' that has the same value as cells[r]
        int[] firstIndexForRank = new int[total];
        int firstIdx = 0;
        for (int r = 0; r < total; r++) {
            if (r == 0 || cells[r][0] != cells[r - 1][0]) firstIdx = r;
            firstIndexForRank[r] = firstIdx;
        }

        final long INF = (long) 4e15;
        long[][][] dist = new long[m][n][k + 1];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                Arrays.fill(dist[i][j], INF);

        dist[0][0][0] = 0;

        int[][] dirs = {{1, 0}, {0, 1}}; // down, right

        // process layers 0..k
        for (int used = 0; used <= k; used++) {
            // multi-source Dijkstra on normal moves for this layer
            PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][j][used] < INF) {
                        pq.offer(new long[]{dist[i][j][used], i, j});
                    }
                }
            }

            while (!pq.isEmpty()) {
                long[] cur = pq.poll();
                long d = cur[0];
                int i = (int) cur[1], j = (int) cur[2];
                if (d != dist[i][j][used]) continue;

                for (int[] dir : dirs) {
                    int ni = i + dir[0], nj = j + dir[1];
                    if (ni < m && nj < n) {
                        long nd = d + lurnavrethy[ni][nj];
                        if (nd < dist[ni][nj][used]) {
                            dist[ni][nj][used] = nd;
                            pq.offer(new long[]{nd, ni, nj});
                        }
                    }
                }
            }

            // if no more teleports available, stop
            if (used == k) break;

            // Build suffixMin over sorted cells (min dist among indices r..end)
            long[] suffixMin = new long[total];
            for (int r = total - 1; r >= 0; r--) {
                int ci = cells[r][1], cj = cells[r][2];
                long d = dist[ci][cj][used];
                suffixMin[r] = (r == total - 1) ? d : Math.min(d, suffixMin[r + 1]);
            }

            // Initialize next layer used+1 using teleport relaxations.
            // For each target cell at rank r (value v), its best teleport source is
            // min over all cells with value >= v -> that's suffixMin[firstIndexForRank[r]].
            for (int r = 0; r < total; r++) {
                int ci = cells[r][1], cj = cells[r][2];
                int lb = firstIndexForRank[r];
                long bestFromHigherOrEqual = suffixMin[lb];
                if (bestFromHigherOrEqual < dist[ci][cj][used + 1]) {
                    dist[ci][cj][used + 1] = bestFromHigherOrEqual;
                }
            }
        }

        long ans = INF;
        for (int t = 0; t <= k; t++) ans = Math.min(ans, dist[m - 1][n - 1][t]);
        return ans >= INF ? -1 : (int) ans;
    }
}
