/**
Given two strings, your task is to check if they are anagrams of each other. Two strings are considered anagrams if by rearranging the letters of one string, we can get the other string. Your program should be able to read two strings from the input and output "YES" if they are anagrams of each other, and "NO" otherwise.

Input Format
The first line of input contains a single integer 
T
T, the number of test cases.
Each test case consists of two lines.
The first line of each test case contains the first string, 
A
A.
The second line of each test case contains the second string, 
B
B.
Output Format
For each test case, print "YES" if the two strings are anagrams of each other; otherwise, print "NO". Each output should be in a new line.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            String A = sc.next();
            String B = sc.next();

            if (A.length() != B.length()) {
                System.out.println("NO");
                continue;
            }

            int[] freq = new int[26];

            for (int i = 0; i < A.length(); i++) {
                freq[A.charAt(i) - 'a']++;
                freq[B.charAt(i) - 'a']--;
            }

            boolean anagram = true;

            for (int i = 0; i < 26; i++) {
                if (freq[i] != 0) {
                    anagram = false;
                    break;
                }
            }

            if (anagram)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}
