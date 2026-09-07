class Solution {
    public int[][] transpose(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int numRowTranspose = numCols;
        int numColTranspose = numRows;

        int transposemat[][] = new int[numRowTranspose][numColTranspose];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                transposemat[j][i] = matrix[i][j];
            }
        }

        return transposemat;
    }
}