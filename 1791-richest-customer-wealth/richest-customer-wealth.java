class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int n = accounts.length;
        
       
        for(int i = 0; i < n; i++ ){
            int sum = 0;
         int m = accounts[i].length;
           
            for(int j = 0; j < m ; j++){
                sum+=accounts[i][j];
            }
            if (max < sum) {   
                max = sum;
            }
        }
        return max;
    }
}