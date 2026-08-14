/**
Given a string S consisting of only lowercase and uppercase English letters and spaces, your task is to convert it into title case. In title case, the first letter of each word is capitalized while the rest are in lowercase, except for words that are entirely in uppercase (considered as acronyms), which should remain unchanged.

Note:

Words are defined as contiguous sequences of English letters separated by spaces.
Acronyms are words that are entirely in uppercase and should remain unchanged.
Assume the input does not contain leading, trailing, or multiple spaces between words.
Input Format
The first line contains a single integer T, the number of test cases.
Each of the next T lines contains a string S.
Output Format
For each test case, print a single line containing the string S converted into title case.
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
        sc.nextLine();

        while (T-- > 0)
        {
            String s = sc.nextLine();

            String[] words = s.split(" ");

            for (int i = 0; i < words.length; i++)
            {
                String word = words[i];

                boolean acronym = true;
                for (int j = 0; j < word.length(); j++)
                {
                    if (Character.isLowerCase(word.charAt(j)))
                    {
                        acronym = false;
                        break;
                    }
                }
                if (!acronym)
                {
                    word = word.toLowerCase();

                    word = Character.toUpperCase(word.charAt(0))
                           + word.substring(1);
                }

                words[i] = word;
            }

            System.out.println(String.join(" ", words));
        }

        sc.close();
    }
}
