class Solution { 
    public boolean isIsomorphic(String s, String t) { 
        
        int[] mapST = new int[256];
        int[] mapTS = new int[256];
        
        for(int i = 0; i < s.length(); i++) { 
            
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            
            if(mapST[ch1] != mapTS[ch2]) {
                return false;
            }
            
            mapST[ch1] = i + 1;
            mapTS[ch2] = i + 1;
        } 
        
        return true;
    } 
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna