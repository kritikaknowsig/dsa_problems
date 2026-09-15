
class Solution {

    public long minMaxProduct(int[] arr1, int[] arr2) {
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        for(int i = 0; i < arr1.length;i++){
            if(max<arr1[i]){
                max=arr1[i];
            }
        }
        
        for(int j = 0; j<arr2.length;j++){
            if(min>arr2[j]){
                min = arr2[j];
            }
        }
        long result = max*min;
        return result;
    }
}