class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");

        String a = arr[arr.length - 1];

        return a.length();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna