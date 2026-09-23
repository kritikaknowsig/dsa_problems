class Solution {
	public static String reverseString(String s) {
// 		int n = s.length() - 1;
// 		for (int i = 0 ; i < s.length() ; i++) {
// 			int rev = s.charAt(n-i);
		String reversed = new StringBuilder(s).reverse().toString();
		return reversed;
	}
}
