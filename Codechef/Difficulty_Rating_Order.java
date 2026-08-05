/**
Our Chef has some students in his coding class who are practicing problems. Given the difficulty of the problems that the students have solved in order, help the Chef identify if they are solving them in non-decreasing order of difficulty. Non-decreasing means that the values in an array is either increasing or remaining the same, but not decreasing. That is, the students should not solve a problem with difficulty 
d
1
d 
1
​
 , and then later a problem with difficulty 
d
2
d 
2
​
 , where 
d
1
>
d
2
d 
1
​
 >d 
2
​
 .

Output “Yes” if the problems are attempted in non-decreasing order of difficulty rating and “No” if not.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases. The description of the test cases follows.
Each test case consists of 
2
2 lines of input.
The first line contains a single integer 
N
N, the number of problems solved by the students
The second line contains 
N
N space-separate integers, the difficulty ratings of the problems attempted by the students in order.


*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        while (a-- > 0) {
            int b = sc.nextInt();
            int[] c = new int[b];

            for (int i = 0; i < b; i++) {
                c[i] = sc.nextInt();
            }

            boolean flag = true;

            for (int i = 1; i < b; i++) {
                if (c[i] < c[i - 1]) {
                    flag = false;
                    break;
                }
            }

            if (flag)
                System.out.println("Yes");
            else
                System.out.println("No");
        }

        sc.close();
    }
}
