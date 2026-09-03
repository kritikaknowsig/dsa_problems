class Solution {
    public int trap(int[] height) {
        // step 1 : is to calculate maxLeft

        int leftmax[] = new int[height.length];

        leftmax[0] = height[0];
        for(int i = 1; i<height.length; i++){
        leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        // step 2 :- is to calculate rightmax
        int rightmax[] = new int[height.length];

        rightmax[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i>=0;i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        // step 3:- for calculating trapwater:-
        int trappedwater = 0;
        for (int i = 0; i<height.length; i++){
    
        // waterlevel :- minimum(maxleft , maxright)
        int waterlevel = Math.min(leftmax[i], rightmax[i]);

        // trapped water = waterlevel - height[i]
        trappedwater += waterlevel - height[i];

        }
        return trappedwater;
    }
}