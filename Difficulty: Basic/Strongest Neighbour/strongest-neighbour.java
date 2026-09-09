class Solution {
	public ArrayList<Integer> maxAdj(int[] arr) {
		int n = arr.length;
		ArrayList<Integer>list = new ArrayList<>();
		for (int i = 0 ; i<n ; i++) {
			for (int j = i + 1; j<n; j++) {
				if (arr[i]>arr[j]) {
					list.add(arr[i]);
				} else {
					list.add(arr[j]);
				} 
				i++;
			}
		}
		return list;
	}
}
