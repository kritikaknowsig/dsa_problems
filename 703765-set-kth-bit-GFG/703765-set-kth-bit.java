class Solution {
    static int setKthBit(int n, int k) {
       int bitmask = 1<<k;
       return (n|bitmask);
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna