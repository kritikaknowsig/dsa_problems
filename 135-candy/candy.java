class Solution {
    public int candy(int[] ratings) {
        int[] l2r = new int[ratings.length];
        int[] r2l = new int[ratings.length];
        Arrays.fill(l2r, 1);
        Arrays.fill(r2l, 1);

        // for comparision of left

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                l2r[i] = Math.max(l2r[i], l2r[i - 1] + 1);
            }
        }
        // for comparision of right

        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                r2l[i] = Math.max(r2l[i], r2l[i + 1] + 1);
            }
        }

        int result = 0;
        for (int i = 0; i < ratings.length; i++) {
            result += Math.max(l2r[i], r2l[i]);
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna