class Solution {
	public int setBit(int n) {
		int i = 0;
		while ((n & (1 << i)) != 0) {
			i++; }
			
			int bitmask = 1 << i;
			return (n|bitmask);
			
		}
	}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna