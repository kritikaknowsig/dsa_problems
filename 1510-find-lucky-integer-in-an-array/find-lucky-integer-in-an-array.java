class Solution {
    public static int findLucky(int[] arr) {
    int[] freq = new int[501]; // index = number, value = count

    // Count frequency of each number
    for (int num : arr) {
        freq[num]++;
    }

    int luckyNumber = -1;

    // Check which numbers equal their own frequency
    for (int i = 1; i <= 500; i++) {
        if (freq[i] == i) {
            luckyNumber = i; // since we go in increasing order, last match is the max
        }
    }

    return luckyNumber;
}
}