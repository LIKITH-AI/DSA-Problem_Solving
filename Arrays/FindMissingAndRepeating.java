public class Solution {

    public static int[] findMissingRepeatingNumbers(int[] a) {

        long n = a.length;

        // Sum of first N natural numbers
        long SN = (n * (n + 1)) / 2;

        // Sum of squares of first N natural numbers
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        long S = 0;
        long S2 = 0;

        // Calculate actual sum and sum of squares
        for (int i = 0; i < n; i++) {

            S += a[i];

            S2 += (long) a[i] * a[i];
        }

        // Difference between actual and expected sums
        long val1 = S - SN;       // x - y

        long val2 = S2 - S2N;     // x² - y²

        val2 = val2 / val1;       // x + y

        // Find repeating and missing numbers
        long x = (val1 + val2) / 2;

        long y = x - val1;

        return new int[]{(int) x, (int) y};
    }
}