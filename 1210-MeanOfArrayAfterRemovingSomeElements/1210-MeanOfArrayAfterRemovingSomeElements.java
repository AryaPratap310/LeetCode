// Last updated: 25/08/2025, 17:18:40
class Solution {
    public double trimMean(int[] arr) {
        int trim = arr.length / 20;

        qselectmin(arr, 0, arr.length - 1, trim);
        qselectmin(arr, trim, arr.length - 1, arr.length - 2 * trim);

        int sum = 0;
        for (int i = trim, l = arr.length - trim; i < l; i++)
            sum += arr[i];
        return (double) sum / (arr.length - 2 * trim);
    }
   
    Random rnd = new Random();

    public void qselectmin(int[] a, int from, int to, int k) {
        if (from == to)
            return;
        int pi = partition(a, from, to);
        int total = pi - from + 1;
        if (total == k)
            return;
        if (total < k)
            qselectmin(a, pi + 1, to, k - total);
        else
            qselectmin(a, from, pi - 1, k);
    }

    private int partition(int[] a, int l, int r) {
        int p = l + rnd.nextInt(r - l);
        swap(a, p, r);
        p = r;
        int pivot = a[p];

        int i = l;

        for (int j = l; j < r; j++) {
            if (a[j] <= pivot)
                swap(a, i++, j);
        }
        swap(a, i, p);

        return i;
    }

    private void swap(int[] a, int l, int r) {
        int t = a[l];
        a[l] = a[r];
        a[r] = t;
    }
}