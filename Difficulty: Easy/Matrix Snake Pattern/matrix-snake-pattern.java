class Solution {
	static ArrayList<Integer> snakePattern(int matrix[][]) {
		ArrayList<Integer> result = new ArrayList<>();
		
		for (int i = 0; i <= matrix.length - 1; i++) {
			if (i%2 == 0) {
				for (int j = 0 ; j <= matrix.length - 1; j++)
					result.add(matrix[i][j]);
			}else {
			    for(int j = matrix.length-1; j>=0;j--)
				result.add(matrix[i][j]);
			}
			
		}
		
		return result;
	}
}
