class Solution {
    public char repeatedCharacter(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    return s.charAt(i);
                }
            }
        }
        return s.charAt(0);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna