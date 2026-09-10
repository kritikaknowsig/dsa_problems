class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftsum = new int[n];
        int[] rightsum = new int[n];
        int[] result = new int[n];

        leftsum[0] = 0;
        for(int i = 1; i < n; i++ ){
            leftsum[i]= nums[i-1]+leftsum[i-1];
        }

        
        int sum = 0;
        for(int j = n-1; j >=0 ; j--){
            rightsum[j] = sum;
            sum+=nums[j];
        }

        for(int i = 0;i<n;i++){
            result[i] = Math.abs(leftsum[i]-rightsum[i]);
        }
     return result;   
    }
}