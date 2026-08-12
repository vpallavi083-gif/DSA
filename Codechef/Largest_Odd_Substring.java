/**
You are given a string nums consisting of digits representing a large integer. Your task is to find the largest-valued odd integer (as a substring of nums) that can be obtained.

A substring is a contiguous sequence of characters within the string.

Function Declaration
Function Name findLargestOddSubstring – This function finds the largest-valued odd integer that can be obtained as a substring of the given numeric string.

Parameters num : A string representing a large integer, consisting only of digits (0–9).

*/
public static String findLargestOddSubstring(String num) {
    for (int i = num.length() - 1; i >= 0; i--) {
        int digit = num.charAt(i) - '0';

        if (digit % 2 != 0) {
            return num.substring(0, i + 1);
        }
    }

    return "-1";
}
