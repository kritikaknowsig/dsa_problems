class Solution {
	public void bubbleSort(int[] arr) {
		int n = arr.length - 1;
		int swap = 0;
		for (int turn = 0; turn <= n - 1; turn++) {
			swap = 0;
			for (int j = 0; j <= n - 1-turn ; j++) {
				if (arr[j]>arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap++;
				}
				
			} if (swap == 0) {
				break;
				
			}
		}
		
	}
}
