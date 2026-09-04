class Solution {
	public static boolean isPalinArray(int[] arr) {
		for (int i = 0; i<arr.length; i++) {
			int rev = 0;
			int original = arr[i];
			while (arr[i]>0) {
				int lastdigit = arr[i]%10;
				rev = rev*10 + lastdigit;
				arr[i] /= 10;
				
			}	if (original != rev) {
				return false;
				
			}
			
		} return true;
	}
}
