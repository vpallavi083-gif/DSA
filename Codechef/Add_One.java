/**
You are given a large number N. You need to print the number N+1
Note: The number is very large and it will not fit in standard integer data type. You have to take the input as String and then manipulate the digits to convert it to 
N+1.
Input Format
The first line of the input contains a single integer T - the number of test cases. The description of test cases follows.
The first line of each test case contains a single integer N.
Output Format
For each test case, print a single line string - the number N+1.
Constraints 1≤T≤100 1
≤
N
≤
10
200000
−
1
1≤N≤10 
200000
 −1
the sum of the number of digits of all 
N
N in a single test file does not exceed 
4
⋅
10
5
4⋅10 
5
 
Subtasks
Subtask #1 (30 points):

each digit of the number 
N
N is at most 
8
8
Subtask #2 (70 points): original constraints

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
            String n = sc.next();

            char[] arr = n.toCharArray();

            int i = arr.length - 1;

            while (i >= 0 && arr[i] == '9') {
                arr[i] = '0';
                i--;
            }

            if (i >= 0) {
                arr[i]++;
                System.out.println(new String(arr));
            } else {
                System.out.println("1" + new String(arr));
            }
        }
    }
}
