class Solution {
	public int getSecondLargest(int[] arr) {
		int largest = -1;
		int secondlargest = -1;
		int n = arr.length;
		
		for (int i = 0; i < n; i++) {
			if (arr[i] > largest) {
				secondlargest = largest;
				largest = arr[i];
			} else if (secondlargest < arr[i] && largest != arr[i]) {
				secondlargest = arr[i];
			}
			
		}
		return secondlargest;
	}
}
