class Solution {
    public int maxDistance(String moves) {
        int x = 0;
        int y = 0;
        int u = 0;
        int maxMD = 0;
        for(int i = 0; i < moves.length(); i++){
            char c = moves.charAt(i);
    
            if(c == 'U'){
                y++;
            } else if(c == 'D'){
                y--;
            } else if( c == 'L'){
                x--;
            } else if( c == 'R'){
                x++;
            } else{
                u++;
            }
        }

        int md = Math.abs(x)+Math.abs(y);
        maxMD = md+u;
     
        return maxMD;
    }
}