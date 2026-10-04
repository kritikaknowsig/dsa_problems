class Solution {
    public int minRotations(String s) {
       
        int r = 0;
        int current = 0;
        for(int i = 0 ; i < s.length() ; i++){
            int next = (s.charAt(i) - '0');
           
            int diff = Math.abs(next-current);
            r += Math.min(diff , 10-diff);
            current = next;
        }
        return r;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna