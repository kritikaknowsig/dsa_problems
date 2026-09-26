class Solution {
    public String convert(String s) {
        StringBuilder S = new StringBuilder("");
                char ch = Character.toUpperCase(s.charAt(0));
                S.append(ch);

                for(int i = 1 ; i < s.length() ; i++){
                    if(s.charAt(i) == ' ' && i < s.length()-1){
                        S.append(s.charAt(i));
                        i++;

                        S.append(Character.toUpperCase(s.charAt(i)));
                    }else{
                        S.append(Character.toLowerCase(s.charAt(i)));
                    }

                }
                String r = S.toString();
                return r;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna