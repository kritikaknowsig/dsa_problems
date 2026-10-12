
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int count = 1;

        for (int i = 1; i <= n; i++) {
            if (i<n && nums[i] == nums[i - 1]) {
                count++;
            } else {
                if(count > n/3){
                    ans.add(nums[i-1]);
                }
                count = 1;
            }

        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna