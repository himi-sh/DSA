public class LongestUniqueString {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        int i = 0;
        int j = 0;
        int n = s.length();
        String longest = "";
        if (n == 0 || n == 1) {
            return n;
        }

        while (i < j && j < n) {
            Character c = s.charAt(j);
            j++;
            // present in longest string or not
            if (longest.indexOf(c.toString()) < -1 ) {
                longest = longest + c;
            } else {
                
            }
        }
        return len;        
    }
}
