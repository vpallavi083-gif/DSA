/**
You are given a string that represents a positive number. Your task is to write a program that converts this string into its numerical equivalent without using any in-built parsing, conversion libraries, or direct type casting methods. The string will not contain any leading zeros, decimals, or any non-numeric characters.

Complete the function stringToNumber in the IDE

Input Format
The first line contains a single integer, T, the number of test cases.
The following T lines each contain a single string, S, representing the number.
Output Format
For each test case, print the numerical equivalent of the string.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
∣
S
∣
≤
10
1≤∣S∣≤10, where 
∣
S
∣
∣S∣ is the length of the string.
S will only contain digits (0-9) and will not have leading zeros
*/

public static long stringToNumber(String str) {
    long num = 0;

    for (int i = 0; i < str.length(); i++) {
        int digit = str.charAt(i) - '0';
        num = num * 10 + digit;
    }

    return num;
}
