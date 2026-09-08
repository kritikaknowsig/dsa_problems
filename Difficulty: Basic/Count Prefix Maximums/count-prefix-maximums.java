class Solution {
	public int countElements(int[] arr) {
		int maxSoFar = 0;
		int n = arr.length;
  int c = 0;
  for (int i = 0; i < n; i++) {
      if (arr[i] > maxSoFar) {
          c++;
          maxSoFar = arr[i];
      }
  }
  return c;
	}
}
