class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        if(s.equals(goal)){
            return true;
        }
        String current = "";
       for(int i = 1 ; i < s.length(); i++){
       current = s.substring(i) + s.substring(0, i);
        if(current.equals(goal)){
            return true;
        }

       }
       return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna