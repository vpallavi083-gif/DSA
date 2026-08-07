/**
You are climbing a staircase with n + 1 steps, numbered from 0 to n.

You are also given a 1-indexed integer array costs of length n, where costs[i] is the cost of step i.

From step i, you can jump only to step i + 1, i + 2, or i + 3. The cost of jumping from step i to step j is defined as: costs[j] + (j - i)2

You start from step 0 with cost = 0.

Return the minimum total cost to reach step n.
*/
class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < n; i++) {
            if (i + 1 <= n) {
                int jump = 1;
                dp[i + 1] = Math.min(
                    dp[i + 1],
                    dp[i] + costs[i] + jump * jump
                );
            }
            if (i + 2 <= n) {
                int jump = 2;
                dp[i + 2] = Math.min(
                    dp[i + 2],
                    dp[i] + costs[i + 1] + jump * jump
                );
            }
            if (i + 3 <= n) {
                int jump = 3;
                dp[i + 3] = Math.min(
                    dp[i + 3],
                    dp[i] + costs[i + 2] + jump * jump
                );
            }
        }

        return dp[n];
    }
}
