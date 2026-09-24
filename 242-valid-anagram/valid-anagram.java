class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        String S = new String(arr); 
        String T = new String(arr2);
        boolean anagram = true;

        if (S.length() != T.length()) return false;
        for(int i = 0 ; i < S.length() ; i++){
            if(S.charAt(i)!=T.charAt(i)){
                anagram = false;
            }
        }
        return anagram;
     }
}
