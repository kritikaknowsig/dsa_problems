class Solution {
	public void reverseArray(int arr[]) {
		// code here
		int srt = 0;
		int end = arr.length-1;
		 while(srt < end ){
		     int temp = arr[srt];
		     arr[srt] = arr[end];
		     arr[end] = temp;
		     srt++;
		     end--;
		 }
	}
}
