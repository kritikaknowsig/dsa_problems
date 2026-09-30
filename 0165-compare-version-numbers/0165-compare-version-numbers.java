class Solution {
    public int compareVersion(String version1, String version2) {
        String[]  arr1  = version1.split("\\.");
        String[]  arr2  = version2.split("\\.");
        
           int max = Math.max(arr1.length, arr2.length);
            int min = Math.min(arr1.length, arr2.length);

            for(int i = 0 ; i < min ; i++){
                int a = Integer.parseInt(arr1[i]);
                int b = Integer.parseInt(arr2[i]);
                if(a!=b){
                    if(a>b){
                        return 1;
                    }else{
                        return -1;
                    }
                }

            } 
            if(arr1.length != arr2.length){
                for(int j = min; j < max ; j++){
                if(arr2.length > arr1.length){
                    int b = Integer.parseInt(arr2[j]);
                    if(b != 0){
                        return -1;
                    }
                }else{
                     int a = Integer.parseInt(arr1[j]);
                    if(a != 0){
                        return 1;
                    }
                }
            }
        

        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna