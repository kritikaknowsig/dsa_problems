class Solution {
    public int majorityElement(int[] nums) {
        int n = 1;
        int i = 0;
        
        for(i = 0; i < nums.length; i++){
            
            for(int j = i+1; j< nums.length;j++){
                
                if(nums[i]== nums[j]){
                    n++;
                }
            }
                if(n>nums.length/2){
                    return nums[i];
                }
              n = 1;
                
            }
            return 0;
        } 
        
        
    }
