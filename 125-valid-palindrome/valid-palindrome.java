class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        
        String cleaned = sb.toString();
        int n = cleaned.length() - 1;
        
        for(int i = 0; i < cleaned.length() / 2; i++){
            if(cleaned.charAt(i) != cleaned.charAt(n - i)){
                return false;
            }
        }
        
        return true;
    }
}