/**
Chef is planning to setup a secure password for his Codechef account. For a password to be secure the following conditions should be satisfied:

Password must contain at least one lower case letter  [a−z];
Password must contain at least one upper case letter [A−Z] strictly inside (first or the last character won’t be considered)

Password must contain at least one digit [0−9] strictly inside;
Password must contain at least one special character from the set 
{
{ '@', '#', '%', '&', '?' 
}
} strictly inside;
Password must be at least 10 characters in length, but it can be longer.
Chef has generated several strings and now wants you to check whether the passwords are secure based on the above criteria. Please help Chef in doing so.
Input
First line will contain 
T
T, number of testcases. Then the testcases follow.
Each testcase contains of a single line of input, string 
S
S.
Output
For each testcase, output in a single line "YES" if the password is secure and "NO" if it is not.
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

            if(s.length() < 10)
            {
                System.out.println("NO");
                continue;
            }

            boolean lower = false;
            boolean upper = false;
            boolean digit = false;
            boolean special = false;

         
            for(int i = 0; i < s.length(); i++)
            {
                char ch = s.charAt(i);

               
                if(ch >= 'a' && ch <= 'z')
                {
                    lower = true;
                }
                if(i > 0 && i < s.length() - 1)
                {
                    if(ch >= 'A' && ch <= 'Z')
                    {
                        upper = true;
                    }

                    if(ch >= '0' && ch <= '9')
                    {
                        digit = true;
                    }

                    if(ch == '@' || ch == '#' || ch == '%' ||
                       ch == '&' || ch == '?')
                    {
                        special = true;
                    }
                }
            }

            if(lower && upper && digit && special)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
