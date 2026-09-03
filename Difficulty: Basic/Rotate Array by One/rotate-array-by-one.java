// // Function to rotate the given array in a clockwise direction
class Solution {
    public void rotate(int[] arr) {
        int n = arr.length;
        // storing the last element of the array in a variable x
        int x = arr[n - 1];

        // shifting each element one position to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // placing the stored element x in the first position of the array
        arr[0] = x;
    }
}