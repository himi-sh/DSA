import java.util.*;
public abstract class GfGMaxStringDiff {
    
    static void findValues(String str, int n)
    {
        long max_diff = Long.MIN_VALUE;
        String ans_1 = "", ans_2 = "";
  
        // Loop for traversing on left half
        // part of input String
        for (int i = 0; i < (n / 2); i++) {
  
            // Variable to store first string
            String str1 = "";
  
            // Loop for initializing first string
            for (int j = 0; j <= i; j++) {
                str1 += str.charAt(j);
            }
  
            // Loop for traversing on right
            // half part of first string
            for (int k = (i + 1); k < n; k++) {
  
                // Variable to store second
                // string temprorary
                String str2 = "";
  
                // Checking that end index
                // of second string should
                // not be out of bound of
                // input string Otherwise
                // will give ArrayIndexOutofBoundsException
                if ((k + i) < n) {
  
                    // Loop for initialzing second string
                    for (int l = k; l <= k + i; l++) {
                        str2 += str.charAt(l);
                    }
  
                    // Variable to store maximum
                    // difference temprorary
                    long difference
                        = Difference(str1, str2);
  
                    if (difference > max_diff) {
                        max_diff = difference;
                        ans_1 = str1;
                        ans_2 = str2;
                    }
                }
            }
        }
  
        // Printing First and second non-
        // intrescting string along with
        // maximum difference between them
        System.out.println("String 1: " + ans_1 + "\n"
                           + "String 2: " + ans_2);
        System.out.println("Maximum difference: "
                           + max_diff);
    }
  
    // Driver code
    public static void main(String[] args)
    {
        String str = "987342";
        int N = str.length();
  
        // Function call
        findValues(str, N);
    }
  
    // User defined function to obtain
    // difference between two strings of
    // equal length
    static long Difference(String X, String Y)
    {
        long counter = 0;
        for (int i = X.length() - 1; i >= 0; i--) {
            counter
                += (Math.abs(X.charAt(i) - Y.charAt(i)));
        }
        return counter;
    }
}