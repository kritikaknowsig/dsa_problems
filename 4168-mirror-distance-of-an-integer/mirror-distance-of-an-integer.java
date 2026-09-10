class Solution {
    public int mirrorDistance(int n) {
        int original = n;
        int rev = 0;
        int result = 0;
        while(n>0){
            int lastdig = n%10;
            rev = (rev*10 )+ lastdig;
            n/=10;
        }  
        
        result = Math.abs(rev - original);
        return result;
    }
}