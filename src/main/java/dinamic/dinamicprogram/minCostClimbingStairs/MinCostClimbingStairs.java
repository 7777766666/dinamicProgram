package dinamic.dinamicprogram.minCostClimbingStairs;

public class MinCostClimbingStairs {

    public static void main(String[] args) {

        int[] ints = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();
        System.out.println(minCostClimbingStairs.minCostClimbingStairs1(ints));
    }


    private int minCostClimbingStairs(int[] cost) {

        int x1 = cost[0];
        int x2 = cost[1];

        for (int i = 2; i < cost.length; i++) {
            var temp = x2;
            x2 = Math.min(x1, x2) + cost[i];
            x1 = temp;
        }

        return Math.min(x1, x2);
    }

    // Bottom up tabulation - O(n) 1ms
    public int minCostClimbingStairs1(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        for (int i=0; i<n; i++) {
            if (i<2) dp[i] = cost[i];
            else dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }
        return Math.min(dp[n-1], dp[n-2]);
    }

}

