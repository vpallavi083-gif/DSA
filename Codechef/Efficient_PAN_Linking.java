/**
There are 
20
20 officers in Chefland who can link the PAN to Aadhar.N applications were received for linking PAN. However, due to an internal conflict, each officer intends to process exactly the same number of applications.
Determine the minimum number of applications that would remain unprocessed.Note that N can be huge and might not fit in an integer.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of a single integer 
N
N, denoting the number of applications.
Output Format
For each test case, output the minimum number of applications that will remain unprocessed.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();

            int remainder = 0;

            for (int i = 0; i < s.length(); i++) {
                int digit = s.charAt(i) - '0';

                remainder = (remainder * 10 + digit) % 20;
            }

            System.out.println(remainder);
        }
    }
}
