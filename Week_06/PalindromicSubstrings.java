/**
 * 647. 回文子串
 */
public class PalindromicSubstrings {

    public int countSubstrings(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }
        int len = s.length();
        int res = 0;
        boolean[][] dp = new boolean[len][len];
        for (int j  = 0; j < len; j++) {
            for (int i = 0; i <= j; i++) {
                if (s.charAt(i) == s.charAt(j) && (j-i < 2 || dp[i+1][j-1])) {
                    dp[i][j] = true;
                    res++;
                }
            }
        }
        return res;

    }
}