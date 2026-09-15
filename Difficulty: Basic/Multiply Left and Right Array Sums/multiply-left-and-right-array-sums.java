class Solution {
    public int multiply(int[] arr) {
        int n = arr.length;
        
        int sum1 = 0;
        for(int i = 0; i<n/2; i++){
            sum1+=arr[i];
        }
        
            int sum2 = 0;
            for(int j = (n/2);j<n;j++){
                sum2 += arr[j];
            }
            
            int result = sum1*sum2;
            return result;
            
            
        }
        
    }

