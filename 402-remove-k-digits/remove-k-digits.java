class Solution {
    public String removeKdigits(String num, int k) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {

            char c = num.charAt(i);

            while (sb.length() > 0 && k > 0 &&
                   sb.charAt(sb.length() - 1) > c) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }

            sb.append(c);
        }

        for (int i = 0; i < k; i++) {
            sb.deleteCharAt(sb.length() - 1);
        }

        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0')
            i++;

        return i == sb.length() ? "0" : sb.substring(i);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna