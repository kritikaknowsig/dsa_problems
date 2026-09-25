class Solution {
    public int compress(char[] chars) {
        
        int track = 0;
        for(int i = 0; i < chars.length ; i++){
            Integer count = 1;
            while((i<chars.length-1) && (chars[i] == chars[i+1])){
                count++;
                i++;
            }
            chars[track++] = chars[i]; 
            if(count > 1){
                if(count < 9){
                   chars[track++] = (char)(count+'0');
                }else{
                    char digit[] = count.toString().toCharArray();
                    for(int j=0; j<digit.length; j++){
                        chars[track++] = digit[j];
                    }
                }
            }
        }
        
        return track;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna