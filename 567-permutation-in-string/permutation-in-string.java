class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] freq = new int[26];
        for(int i = 0 ; i < s1.length(); i++){
            freq[s1.charAt(i) - 'a']++; //storing frequency(number of times a alphabet comes) of each char
        }

        int[] windowfreq = new int[26];
        int i = 0;//pointer 1
        for(int j = 0 ; j < s2.length(); j++){
            windowfreq[s2.charAt(j) - 'a']++; // storing window frequncy and then incrementing 
             if(j-i+1 > s1.length()){ // (j-i+1) is size of window, if window size exceeds s1.length()
            windowfreq[s2.charAt(i)-'a']--;//decre freq 
                i++;//slide the window
            } if(Arrays.equals(freq , windowfreq)){//check if window matches
                return true;
            }
        }
        return false;
        

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna