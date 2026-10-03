class Solution {
    public int superPow(int a, int[] b) {

        a = a % 1337;

        int result = 1;

        for (int digit : b) {
            result = pow(result, 10);
            result = (result * pow(a, digit)) % 1337;
        }

        return result;
    }

    public int pow(int a, int b) {
        int result = 1;

        for (int i = 0; i < b; i++) {
            result = (result * a) % 1337;
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna