class Solution {
	public int[] decompressRLElist(int[] nums) {
		ArrayList<Integer> list = new ArrayList<>();
		int fq = 0;
		int val = 0 ;
		
		for (int i = 0; i < nums.length ; i +=2) {
			fq = nums[i];
            val = nums[i + 1];
			
			for (int j = 0; j < fq ; j++) {
				list.add(val);
			}
		}
		int[] arr = new int[list.size()];
		
		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		
        return arr;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna