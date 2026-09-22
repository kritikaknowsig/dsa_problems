class Solution {
    public String longest(String[] arr) {
        String largest = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(largest.length()<arr[i].length()){
                largest = arr[i];
            }
        }
      return largest;  
    }
}