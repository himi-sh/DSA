public class MaxStringDiff {
    public long maxStringDiff(String str) {
        int max = 0;
        String s1 = "";
        int n = str.length();
        for (int i = 0; i < n/2; i++) {
            s1 +=str.charAt(i);
            String s2 = "";
            for (int j = n/2; j < n; i++) {
                s2 +=str.charAt(j);
                
            }
        }
        return max;
    }
}
