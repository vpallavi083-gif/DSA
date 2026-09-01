/**
Lapindrome is defined as a string which when split in the middle, gives two halves having the same characters and same frequency of each character. If there are odd number of characters in the string, we ignore the middle character and check for lapindrome. For example gaga is a lapindrome, since the two halves ga and ga have the same characters with same frequency. Also, abccab, rotor and xyzxy are a few examples of lapindromes. Note that abbaab is NOT a lapindrome. The two halves contain the same characters but their frequencies do not match.
Your task is simple. Given a string, you need to tell if it is a lapindrome.

Input:
First line of input contains a single integer T, the number of test cases.
Each test is a single line containing a string S composed of only lowercase English alphabet.
Output:
For each test case, output on a separate line: "YES" if the string is a lapindrome and "NO" if it is not.
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

        while(T-- > 0)
        {
            String s = sc.next();
            int n = s.length();

            int[] left = new int[26];
            int[] right = new int[26];

            for(int i = 0; i < n / 2; i++)
            {
                left[s.charAt(i) - 'a']++;
            }

            int start = (n % 2 == 0) ? n / 2 : n / 2 + 1;

            for(int i = start; i < n; i++)
            {
                right[s.charAt(i) - 'a']++;
            }
            boolean flag = true;

            for(int i = 0; i < 26; i++)
            {
                if(left[i] != right[i])
                {
                    flag = false;
                    break;
                }
            }

            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}
