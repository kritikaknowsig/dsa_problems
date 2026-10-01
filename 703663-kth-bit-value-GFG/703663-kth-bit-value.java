class Solution {
    public int kthLSB(int n, int k) {
        int bitmask = (1<<(k-1));
        return (n&bitmask ) != 0 ? 1 : 0;
        
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna