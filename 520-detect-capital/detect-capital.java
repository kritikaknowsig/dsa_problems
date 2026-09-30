class Solution {
    public boolean detectCapitalUse(String word) {

        int countw = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                countw++;
            }
        }

    

        if (countw == word.length()) {
            return true;
        }

        
        if (countw == 0) {
            return true;
        }


        if (countw == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }



        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna