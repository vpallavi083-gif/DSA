/**
Given two arrays, val[] and wt[], where each element represents the value and weight of an item respectively, and an integer W representing the maximum capacity of the knapsack (the total weight it can hold).

Put the items into the knapsack such that the total value obtained is maximum without exceeding the capacity W.

Note: You can either include an item completely or exclude it entirely — fractional selection of items is not allowed. Each item is available only once.
*/

class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        int n = val.length;
        int[][] dp = new int[n + 1][W + 1];

        for (int[] row : dp){
            java.util.Arrays.fill(row, -1);
     }
        return solveMem(W, val, wt, n, dp);

        
    }
    // Memoization
    int solveMem(int W, int val[], int wt[], int n, int[][] dp){
        
        if (n == 0 || W == 0) {
            return 0;
        }
        
        if(dp[n][W] !=-1){
            return dp[n][W];
        }

        if (wt[n - 1] > W) {
            return dp[n][W]= solveMem(W, val, wt, n - 1,dp);
        }
        
        

        return dp[n][W]= Math.max(
            solveMem(W, val, wt, n - 1,dp),val[n - 1] + solveMem(W - wt[n - 1], val, wt, n - 1,dp));
        
    }
    
// Recursion
    static int solve(int W, int val[], int wt[], int n) {

        if (n == 0 || W == 0) {
            return 0;
        }

        if (wt[n - 1] > W) {
            return solve(W, val, wt, n - 1);
        }

        return Math.max(
            solve(W, val, wt, n - 1),
            val[n - 1] + solve(W - wt[n - 1], val, wt, n - 1));
    }
}
