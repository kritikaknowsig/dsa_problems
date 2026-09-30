class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        for (int l = 1; l <= n / 2; l++) {

            if (n % l == 0) {

                String pattern = s.substring(0, l);
                boolean match = true;

                for (int j = 0; j < n; j += l) {

                    String current = s.substring(j, j + l);

                    if (!current.equals(pattern)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    return true;
                }
            }
        }

        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna