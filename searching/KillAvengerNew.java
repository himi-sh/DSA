import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class KillAvengerNew {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = sc.next();
        char[] arr = str.toCharArray();
        int[] char_counts = new int[4];
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('C', 0);
        map.put('G', 0);
        map.put('T', 0);

        for (int i = 0; i < n; i++) {
            char ch = arr[i];
            if (ch == 'A') {
                char_counts[0] += 1;
                map.put('A', char_counts[0]);
                // substring_counts['A'] += 1;
            } else if (ch == 'T') {
                char_counts[1] += 1;
                map.put('T', char_counts[1]);
                // substring_counts['T'] += 1;
            } else if (ch == 'C') {
                char_counts[2] += 1;
                map.put('C', char_counts[2]);
                // substring_counts['C'] += 1;
            } else if (ch == 'G') {
                char_counts[3] += 1;
                map.put('G', char_counts[3]);
                // substring_counts['G'] += 1;
            }
        }
        String string = "ACTG";
        int left = 0;
        int right = 0;
        int freq = n/4;
        int minLength = n;

        int excessiveCount = 0;
        boolean hasExtraCount = true;

        while (right < n) {
            char ch = str.charAt(right);
            int count = map.get(ch);
            right++;

            int diff = count - freq;
            
            if (diff > 0) {
                hasExtraCount = true;
            } else {
                left++;
                hasExtraCount = false;
            }

            // map.put(ch, count + 1);
            hasExtraCount = true;

            if (minLength > right - left) {
                minLength = right - left;
            }


        }
            
    }    
}
