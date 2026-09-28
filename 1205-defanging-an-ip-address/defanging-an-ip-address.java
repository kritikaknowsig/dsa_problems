class Solution {
    public String defangIPaddr(String address) {
        String result = "";
        for(int i = 0 ; i < address.length() ; i++){
           result = address.replace(".", "[.]");
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna