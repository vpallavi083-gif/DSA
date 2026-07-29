/**
Arranging Coins
Solved
Easy
Topics
premium lock icon
Companies
You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.

*/
class Solution {
    public int arrangeCoins(int n) {
        int left = 1;
        int right = n;
        while(left <= right){
            int mid = left + (right-left)/2;
            long c = (long)mid * (mid+1)/2;
            if(c == n){
                return mid;
            }else if(c < n){
               left = mid+1;
            }else{
                right = mid-1;;
            }

        }
        return right;
    }
}
