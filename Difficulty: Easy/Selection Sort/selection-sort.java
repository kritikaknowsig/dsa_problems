class Solution {
    void selectionSort(int[] arr) {
      for(int i = 0 ; i<arr.length-1;i++){
          int minindex = i;
          for(int j = i+1; j<arr.length;j++){
              if(arr[j]<arr[minindex]){
                  minindex = j;
              }
          } // swap 
          int temp = arr[i];
          arr[i] = arr[minindex];
          arr[minindex] = temp;
      }
        
    }
}