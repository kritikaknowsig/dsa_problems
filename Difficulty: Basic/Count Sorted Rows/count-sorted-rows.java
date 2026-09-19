class Solution {
    public int sortedCount(int[][] mat) {
        int count = 0;

        for (int i = 0; i < mat.length; i++) {
            boolean inc = true, dec = true;

            for (int j = 1; j < mat[i].length; j++) {
                if (mat[i][j] <= mat[i][j - 1]) 
                inc = false;
                if (mat[i][j] >= mat[i][j - 1])
                dec = false;
            }

            if (inc || dec) count++;
        }
        return count;
    }
}