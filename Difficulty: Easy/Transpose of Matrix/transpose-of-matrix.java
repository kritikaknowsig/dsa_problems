

class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        int n = mat.length;          // rows
        int m = mat[0].length;       // columns
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

       
        for (int j = 0; j < m; j++) {
            result.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result.get(j).add(mat[i][j]);
            }
        }
        return result;
    }
}