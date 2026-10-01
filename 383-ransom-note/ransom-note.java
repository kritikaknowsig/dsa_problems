class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            if (!magazine.contains(String.valueOf(ransomNote.charAt(i)))) {
                return false;
            }
            magazine = magazine.replaceFirst(String.valueOf(ransomNote.charAt(i)), "");
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna