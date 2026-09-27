class Solution {
	public int maxFreqSum(String s) {
		int max1 = 0;
        int max2 = 0;
		for (int i = 0 ; i < s.length(); i++) {
			int fq1 = 0;
			int fq2 = 0;
            for (int j = 0 ; j < s.length(); j++) {
			    if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
					if (s.charAt(i) == s.charAt(j)) {
						fq1++;
					}
                    if(max1<fq1){
                        max1=fq1;
                    }
					
				} else{
                    if(s.charAt(i)==s.charAt(j)){
                        fq2++;
                    }
                     if(max2<fq2){
                        max2=fq2;
                    }
                }
			}
		}

        return max1+max2;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna