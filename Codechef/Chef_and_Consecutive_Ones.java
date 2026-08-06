/**
Chef and Consecutive Ones
Chef has a binary array  nums containing only 0s and 1s.He wants to find the maximum number of consecutive 1s in the array regardless of how many such streaks exist. Can you help Chef determine this?

Function Declaration
Function Name findMaxConsecutiveOnes - This function computes the maximum length of a contiguous segment of 1s in a binary array.Parameters
nums
nums: A binary array of integers where each element is either 0 or 1.
Return Value
Returns a single integer representing the maximum number of consecutive 1s in the array.
Constraints

1≤N≤10 

nums[i]∈0,1
Input Format
The first line contains a single integer 
N
N — the size of the array.
The second line contains 
N
N space-separated integers representing the binary array nums. Output Format
Print a single integer — the maximum number of consecutive 1s in the array
*/
    public static int findMaxConsecutiveOnes(int[] nums) {
       int curr = 0;
       int max = 0;
       
       for (int i = 0; i < nums.length; i++) {
       if (nums[i] == 1) {
        curr++;
        max = Math.max(max, curr);
    } else {
        curr = 0;
    }
}
       return max;
    }
