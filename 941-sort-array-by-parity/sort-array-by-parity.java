class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] even = new int[nums.length];
        int[] odd = new int[nums.length];

        int evenindex = 0;
        int oddindex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even[evenindex] = nums[i];
                evenindex++;
            } else {
                odd[oddindex] = nums[i];
                oddindex++;
            }
        }

        for (int i = 0; i < evenindex; i++) {
            nums[i] = even[i];
        }

        for (int j = 0; j < oddindex; j++) {
            nums[evenindex + j] = odd[j];
        }

        return nums;
    }
}