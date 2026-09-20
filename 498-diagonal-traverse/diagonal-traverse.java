class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length; //no. of row
        int n = mat[0].length; //no. of col
       
        int row = 0;
        int col = 0;

        int k = 0; //track ans array
        int arr[] = new int[m*n]; 

        int dir = 1;
        while(k < arr.length){
            arr[k++] = mat[row][col];

            if(dir == 1){ //move upward
                if(col == n-1){ //hit right boundary
                    row++; //go down
                    dir = -1; //reverse dirn
                }else if(row == 0){//hit top boundary
                    col++; //go right
                    dir = -1;
                }else{
                    row--;//go up
                    col++; //then right
                }
            }else{ //move downward
                if(row == m-1){ //hit bottome boundary
                    col++; //go right
                    dir = 1;
                }else if(col == 0){ //hit left boundary
                    row++; //go down
                    dir = 1;
                }else{
                    row++; //go down
                    col--; //then left
                }
            }
        }
        return arr;
    }
}