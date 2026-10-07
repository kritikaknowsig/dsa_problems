class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        long total = (long) m * k;

        if (total > bloomDay.length) {
            return -1;
        }

        int low = 1;
        int high = 0;

        for (int day : bloomDay) {
            high = Math.max(high, day);
        }

        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isPossible(bloomDay, mid, m, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private boolean isPossible(int[] bloomDay, int day, int m, int k) {

        int flowers = 0;
        int bouquets = 0;

        for (int i = 0; i < bloomDay.length; i++) {

            if (bloomDay[i] <= day) {
                flowers++;

                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna