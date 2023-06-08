package dinamic.dinamicprogram.sameStr;

public class Str {

    public static void main(String[] args) {

        String zxcvnm = "zxcvnm313";
        String zxm1 = "zxm71";
        Str str = new Str();
        int same = str.same(zxm1, zxcvnm);
        System.out.println(same);

    }

    private int same(String x, String y) {

        int n = x.length();
        int m = y.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];

    }


}
