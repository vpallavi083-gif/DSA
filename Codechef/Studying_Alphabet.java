/**
Not everyone probably knows that Chef has younger brother Jeff. Currently Jeff learns to read.

He knows some subset of the letter of Latin alphabet. In order to help Jeff to study, Chef gave him a book with the text consisting of N words. Jeff can read a word if it consists only of the letters he knows.

Now Chef is curious about which words his brother will be able to read, and which are not. Please help him!

Input
The first line of the input contains a lowercase Latin letter string S, consisting of the letters Jeff can read. Every letter will appear in S no more than once.

The second line of the input contains an integer N denoting the number of words in the book.

Each of the following N lines contains a single lowercase Latin letter string Wi, denoting the ith word in the book.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        boolean[] known = new boolean[26];

        for (char ch : s.toCharArray()) {
            known[ch - 'a'] = true;
        }

        while (n-- > 0) {
            String word = sc.next();

            boolean canRead = true;

            for (char ch : word.toCharArray()) {
                if (!known[ch - 'a']) {
                    canRead = false;
                    break;
                }
            }

            if (canRead) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}
