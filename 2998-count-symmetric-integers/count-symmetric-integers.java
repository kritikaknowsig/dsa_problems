class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int x = low; x <= high; x++) {
            String s = Integer.toString(x);
            int len = s.length();
            if (len % 2 != 0) continue;   
            
            int firstHalfSum = 0, secondHalfSum = 0;
            for (int i = 0; i < len / 2; i++) {
                firstHalfSum += s.charAt(i) - '0';
            }
            for (int i = len / 2; i < len; i++) {
                secondHalfSum += s.charAt(i) - '0';
            }
            
            if (firstHalfSum == secondHalfSum) count++;
        }
        return count;
    }
}