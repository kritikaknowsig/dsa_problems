class Solution {
	public int setAllRangeBits(int n, int l, int r) {
		int a = (~0) << r;
		int b = (1 << (l - 1)) - 1;
		return(n|(~(a|b)));
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna