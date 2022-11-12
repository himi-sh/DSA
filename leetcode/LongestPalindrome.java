public class LongestPalindrome {
    // O ( n ^ 3)
    public String longestPalindrome1(String s) {
        String longest = "";
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub)) {
                    if (sub.length() > max) {
                        max = sub.length();
                        longest = sub;
                    }
                }
            }
        }

        return longest;
    }

    // O ( n ^ 2)
    public String longestPalindrome2(String s) {
        String longest = "";
        int max = 0;
        int n = s.length();

        // odd length palindrome
        for (int i = 0; i < n - 1; i++) {
            int l = i;
            int r = i;
            while (l >= 0 & r < n) {
                if (s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                } else {
                    break;
                }
            }

            int len = r - l - 1;
            if (len > max) {
                max = len;
                longest = s.substring(l + 1, r);
            }
        }

        // even length palindrome
        for (int i = 0; i < n - 1; i++) {
            int l = i;
            int r = i+1;
            while (l >= 0 & r < n) {
                if (s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                } else {
                    break;
                }
            }

            int len = r - l - 1;
            if (len > max) {
                max = len;
                longest = s.substring(l + 1, r);
            }
        }      
        return longest;
    }

    public String longestPalindrome(String s) {
        int max = 0;
        String longest = "";
        int start = 0;
        int end = 1;

        // abcba
        while (start != end && end <= s.length()) {
            String current = s.substring(start, end);
            int currentLen = end - start;
            if (isPalindrome(current)) {
                if (currentLen > max) {
                    longest = current;
                    max = currentLen;
                }
                end++;
            } else if (currentLen % 2 != 0) {
                start++;
            } else {
                end++;
            }
        }
        return longest;
    }

    private boolean isPalindrome(String s) {
        int len = s.length();
        char[] chars = s.toCharArray();

        for (int i = 0; i < len / 2; i++) {
            if (chars[i] != chars[len - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
