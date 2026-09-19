class Solution {
    public int[][] sortedMatrix(int mat[][]) {
       
                int n = mat.length;
                int[] t = new int[n * n];

                for (int i = 0; i < n; i++)
                    for (int j = 0; j < n; j++)
                        t[i * n + j] = mat[i][j];

                Arrays.sort(t);

                for (int i = 0; i < n; i++)
                    for (int j = 0; j < n; j++)
                        mat[i][j] = t[i * n + j];

                return mat;
            }
        }
    