class Solution {
    public String capitalizeTitle(String title) {
        // StringBuilder S = new StringBuilder("");
        // char ch = Character.toUpperCase(title.charAt(0));
        // S.append(ch);

        // for(int i = 1 ; i < title.length() ; i++){
        //     if(title.charAt(i) == ' ' && i < title.length()-1){
        //         S.append(title.charAt(i));
        //         i++;
                
        //         S.append(Character.toUpperCase(title.charAt(i)));
        //     }else{
        //         S.append(Character.toLowerCase(title.charAt(i)));
        //     }

        // }
        // String result = S.toString();
        // return result;
        String [] arr = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<arr.length;i++){
            String word = arr[i];
            int length = word.length();
            if(length <= 2){
                sb.append(word.toLowerCase());
            }else{
                sb.append(Character.toUpperCase(word.charAt(0)));
                for(int j=1; j<word.length(); j++){
                    sb.append(Character.toLowerCase(word.charAt(j)));
                }
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}