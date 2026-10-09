
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        long total = (long) m * k;

        if (total > bloomDay.length) {
            return -1;
        }

        int low = bloomDay[0];
        int high = bloomDay[0];

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] < low) {
                low = bloomDay[i];
            }

            if (bloomDay[i] > high) {
                high = bloomDay[i];
            }
        }

        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int boq = 0;
            int flr = 0;

            for (int i = 0; i < bloomDay.length; i++) {
                if (bloomDay[i] <= mid) {
                    flr++;

                    if (flr == k) {
                        boq++;
                        flr = 0;
                    }
                } else {
                    flr = 0;
                }
            }

            if (boq >= m) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
// Remember the order:
// Check whether enough flowers exist.
// Find the minimum and maximum bloom days.
// Start binary search.
// For each mid, count consecutive bloomed flowers and bouquets.
// Update low or high.
// Return ans.

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna