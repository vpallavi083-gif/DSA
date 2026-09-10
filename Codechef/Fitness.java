/**
Chef wants to become fit for which he decided to walk to the office and return home by walking. It is known that Chef's office is X km away from his home.
If his office is open on 5 days in a week, find the number of kilometers Chef travels through office trips in a week.
Input Format
First line will contain T, number of test cases. Then the test cases follow.Each test case contains of a single line consisting of single integer X.
Output Format
For each test case, output the number of kilometers Chef travels through office trips in a week.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int x = scanner.nextInt();
            int answer = x * 10;

            System.out.println(answer);
        }
    }
}
