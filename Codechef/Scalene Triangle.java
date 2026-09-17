/**
Given A,B, and C as the sides of a triangle, find whether the triangle is scalene.

Note:

A triangle is said to be scalene if all three sides of the triangle are distinct.
It is guaranteed that the sides represent a valid triangle.
Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of three space-separated integer A,B, and C — the length of the three sides of the triangle.
Output Format
For each test case, output on a new line, YES, if the triangle is scalene, and NO otherwise.

You may print each character of the string in uppercase or lowercase. For example, YES, yes, Yes, and yEs are all considered identical.
*/
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if (A != B && B != C && A != C)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
