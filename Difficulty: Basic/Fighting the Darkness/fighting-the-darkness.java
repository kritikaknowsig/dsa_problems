class Solution {
    public int maxDays(int arr[]) {
     int maxvalue = 0;
     for(int i = 0 ; i < arr.length; i++){
         maxvalue = Math.max(arr[i], maxvalue);
     } return maxvalue;
        
    }
}