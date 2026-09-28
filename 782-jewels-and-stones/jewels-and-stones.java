class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count  = 0 ;
        for(int i = 0 ; i < stones.length(); i++){
            for(int j = 0; j < jewels.length(); j++){
                if(stones.charAt(i)==jewels.charAt(j)){
                    count++;
                }
            }
        } return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna