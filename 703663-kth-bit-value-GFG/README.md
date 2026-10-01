# [Kth Bit Value](https://www.geeksforgeeks.org/problems/kth-lsb3427/1)
## Easy
Given two integers n and k, determine the value of the kth Least Significant Bit (LSB) in the binary representation of n.The Least Significant Bit (LSB) is the rightmost bit and is considered the 1st bit from the right.Examples :Input: n = 10, k = 4
Output: 1
Explanation: The binary representation of 10 is 1010. Counting bits from right to left:
1st LSB = 0
2nd LSB = 1
3rd LSB = 0
4th LSB = 1
Therefore, the 4th LSB is 1.Input: n = 16, k = 3
Output: 0
Explanation: The binary representation of 16 is 10000. Counting bits from right to left:
1st LSB = 0
2nd LSB = 0
3rd LSB = 0
Therefore, the 3rd LSB is 0.
Constraints:1 ≤ n ≤ 1091 ≤ k ≤ 31