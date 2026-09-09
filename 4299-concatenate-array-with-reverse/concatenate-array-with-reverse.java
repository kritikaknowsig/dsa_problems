class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[]arr = new int[2*nums.length];
        int n = nums.length;
        
        for(int i = 0;i<n;i++){
            arr[i] = nums[i];
        } int k =n;
        for(int j = n-1;j>=0;j--){
            arr[k] = nums[j];
            k++;
        }

        return arr;

    }
}