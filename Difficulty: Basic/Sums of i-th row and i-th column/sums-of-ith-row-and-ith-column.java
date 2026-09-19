class Solution {
    public boolean sumOfRowCol(int[][] mat) {
        int limit = Math.min(mat.length, mat[0].length);

        for (int i = 0; i < limit; i++) {
            int sumrow = 0, sumcol = 0;

            for (int j = 0; j < mat[i].length; j++)
                sumrow += mat[i][j];

            for (int j = 0; j < mat.length; j++)
                sumcol += mat[j][i];

            if (sumrow != sumcol) return false;
        }
        return true;
    }
}