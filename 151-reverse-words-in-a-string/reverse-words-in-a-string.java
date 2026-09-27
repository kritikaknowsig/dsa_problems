class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        int st = 0;
        int end = arr.length-1;
        while(st<end){
            String  temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
       String str = String.join(" " , arr).trim();
    return str;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna