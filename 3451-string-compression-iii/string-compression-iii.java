class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int i = 0;
        int n = word.length();

        while (i < n) {
            Integer count = 1;
            char ch = word.charAt(i);

            while (i < n - 1 && count < 9 &&
                   word.charAt(i) == word.charAt(i + 1)) {
                count++;
                i++;
            }

            comp.append(count).append(ch);
            i++;
        }

        return comp.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna