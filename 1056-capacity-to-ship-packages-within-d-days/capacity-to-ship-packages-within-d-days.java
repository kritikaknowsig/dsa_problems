
class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > low) {
                low = weights[i];
            }

            high += weights[i];
        }

        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int d = 1;
            int sum = 0;

            for (int i = 0; i < weights.length; i++) {
                if (sum + weights[i] <= mid) {
                    sum += weights[i];
                } else {
                    d++;
                    sum = weights[i];
                }
            }

            if (d <= days) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna