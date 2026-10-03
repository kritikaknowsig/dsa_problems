class Solution {
    public static int countSetBits(int n) {
        int count = 0;

        for (int i = 1; i <= n; i = i * 2) {
            count += (n / (i * 2)) * i;

            int rem = n % (i * 2);

            if (rem >= i) {
                count += rem - i + 1;
            }
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna