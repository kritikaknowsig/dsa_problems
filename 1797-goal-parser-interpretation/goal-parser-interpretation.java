class Solution {
    public String interpret(String command) {
        
        for(int i = 0 ; i < command.length() ; i++){
             command = command.replace("()", "o");
             command = command.replace("(al)", "al");
        }
        return command;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna