class Solution {
	public boolean identicalMat(int[][] mat1, int[][] mat2) {
		int n = mat1.length;
		for (int i = 0; i<n; i++) {
			for (int j = 0 ; j<n; j++) {
				if (mat1[i][j] != mat2[i][j]) {
					return false;
					
				}
			}
		} return true;
		
	}
}
