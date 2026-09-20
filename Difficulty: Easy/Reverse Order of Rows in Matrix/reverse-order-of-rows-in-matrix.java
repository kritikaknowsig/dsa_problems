class Solution {
    void interchangeRows(int[][] mat) {
        int n = mat.length - 1;
        int m = mat[0].length - 1;
        int[][] arr = new int[mat.length][mat[0].length];

        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= m; j++) {
                arr[n - i][j] = mat[i][j];
            }
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                mat[i][j] = arr[i][j];
            }
        }
    }
}