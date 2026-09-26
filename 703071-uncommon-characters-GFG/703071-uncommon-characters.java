class Solution {
	String uncommonChars(String s1, String s2) {
		String newstr = "";
		
		for (int i = 0 ; i < s1.length() ; i++) {
			boolean found = false;
			for (int j = 0 ; j < s2.length() ; j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					found = true;
				}
				
			} if (!found && !newstr.contains(String.valueOf(s1.charAt(i)))) {
				newstr += s1.charAt(i);
			}
		}
		
		for (int i = 0; i < s2.length() ; i++) {
			boolean found = false;
			for (int j = 0 ; j<s1.length() ; j++) {
				if (s2.charAt(i) == s1.charAt(j)) {
					found = true;
				}
			} if (!found && !newstr.contains(String.valueOf(s2.charAt(i)))) {
				newstr += s2.charAt(i);
			}
		}
		char[] chars = newstr.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		
		return sorted;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna