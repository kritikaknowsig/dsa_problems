class Solution {
    public int maxDistance(String s, int k) {
        int north = 0;
        int south = 0;
        int east = 0;
        int west = 0;
        int maxMD = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == 'S') {
                south++;
            } else if (c == 'N') {
                north++;
            } else if (c == 'E') {
                east++;
            } else if (c == 'W') {
                west++;
            }

            int currentMD = Math.abs(east - west) + Math.abs(north - south);

            int steps = i + 1;

            int wasted = steps - currentMD;

            int extra = 0;

            if (wasted != 0) {
                extra = Math.min(2 * k, wasted);
            }

            int finalCurrentMD = currentMD + extra;

            maxMD = Math.max(maxMD, finalCurrentMD);
        }

        return maxMD;
    }
}