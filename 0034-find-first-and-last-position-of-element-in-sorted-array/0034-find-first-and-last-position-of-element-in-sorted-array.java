class Solution {
    public int[] searchRange(int[] nums, int target) {
		
		int[] arr = {-1, -1};
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			
			if (nums[mid] == target) {// first postion
				
				if (mid == 0 || nums[mid - 1] != nums[mid]) {
					arr[0] = mid;
					break;
				} else {
					high = mid - 1;
				}
			} else {
				if (nums[mid]<target) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		

        low = 0;
		high = nums.length - 1;
        while (low <= high) {
			int mid = low + (high - low) / 2;
			

		if (nums[mid] == target) {// last position
			if (mid == nums.length - 1 || nums[mid + 1] != nums[mid]) {
				arr[1] = mid;
				break;
			} else {
				low = mid + 1;
			}
		} else {
			if (nums[mid]<target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
	}
 return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna