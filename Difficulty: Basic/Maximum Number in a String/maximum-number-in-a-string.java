class Solution {
	static int extractMaximum(String s) {
		int current = 0;
		StringBuilder num = new StringBuilder();
		boolean digitfound = false;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < s.length() ; i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				num.append(c);
				current = Integer.parseInt(num.toString());
				digitfound = true;
			} 
			 else {
			     
				max = Math.max(current, max);
				current = 0;
				num = new StringBuilder();
				
			}
		
		}
		max = Math.max(current,max);
		
		if (!digitfound) {
			return -1;   
		}
		return max;
	}
}