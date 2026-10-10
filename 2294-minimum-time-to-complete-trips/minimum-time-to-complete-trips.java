class Solution {
    public long minimumTime(int[] time, int totalTrips) {

        long low = 1;
        long high = (long) time[0] * totalTrips;

        for (int i = 1; i < time.length; i++) {
            high = Math.min(high, (long) time[i] * totalTrips);
        }

        long ans = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (isPossible(time, totalTrips, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public boolean isPossible(int[] time, int totalTrips, long mid) {
        long trips = 0;

        for (int i = 0; i < time.length; i++) {
            trips += mid / time[i];

            if (trips >= totalTrips) {
                return true;
            }
        }

        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna