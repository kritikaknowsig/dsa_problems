class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < num.length(); j++) {
            char c = num.charAt(j);

            // pop larger digits from the end while we still can remove
            while (k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) > c) {
                sb.setLength(sb.length() - 1);
                k--;
            }
            sb.append(c);
        }

        // if k is still left, remove from the end (digits are non-decreasing now)
        while (k > 0 && sb.length() > 0) {
            sb.setLength(sb.length() - 1);
            k--;
        }

        // strip leading zeros
        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0') i++;

        return i == sb.length() ? "0" : sb.substring(i);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna