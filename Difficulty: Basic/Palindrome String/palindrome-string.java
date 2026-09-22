class Solution {
	boolean isPalindrome(String s) {
		int n = s.length() - 1;
		for (int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(n - i)) {
				return false;
			}
		}
	return true;	
	}
}
