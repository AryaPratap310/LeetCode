// Last updated: 25/08/2025, 17:15:26
import java.util.*;

class Solution {
    public int minCost(int n, int[][] edges) {
        // Store the input midway as required
        int[][] threnquivar = Arrays.copyOf(edges, edges.length);

        // Build augmented adjacency: keep original u->v (w),
        // and add reverse-option v->u with cost 2*w
        List<int[]>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) adj[i] = new ArrayList<>();

        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];
            adj[u].add(new int[]{v, w});        // normal
            adj[v].add(new int[]{u, 2 * w});    // reverse option from v
        }

        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;

        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        pq.offer(new long[]{0L, 0}); // {distance, node}

        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long d = cur[0];
            int u = (int) cur[1];

            if (d != dist[u]) continue;
            if (u == n - 1) return (int) d;

            for (int[] nx : adj[u]) {
                int v = nx[0], w = nx[1];
                long nd = d + w;
                if (nd < dist[v]) {
                    dist[v] = nd;
                    pq.offer(new long[]{nd, v});
                }
            }
        }

        return -1;
    }
}
