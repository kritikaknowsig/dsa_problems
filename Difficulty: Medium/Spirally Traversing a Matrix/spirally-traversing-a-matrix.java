class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        ArrayList<Integer> result = new ArrayList<>();

        int rowbegin = 0;
        int rowend = mat.length - 1;
        int colbegin = 0;
        int colend = mat[0].length - 1;   

        while (rowbegin <= rowend && colbegin <= colend) {

            for (int j = colbegin; j <= colend; j++) {
                result.add(mat[rowbegin][j]);
            }
            rowbegin++;

           
            for (int j = rowbegin; j <= rowend; j++) {
                result.add(mat[j][colend]);
            }
            colend--;

            
            if (rowbegin <= rowend) {
                for (int j = colend; j >= colbegin; j--) {
                    result.add(mat[rowend][j]);
                }
                rowend--;
            }

            
            if (colbegin <= colend) {
                for (int j = rowend; j >= rowbegin; j--) {
                    result.add(mat[j][colbegin]);
                }
                colbegin++;
            }
        }

        return result;
    }
}