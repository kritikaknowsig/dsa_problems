import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        int freq = 1;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                freq++;

                if (freq > nums.length / 2) {
                    return nums[i];
                }
            } else {
                freq = 1;
            }
        }

        return nums[0];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna