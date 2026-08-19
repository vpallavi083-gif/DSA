/**
Two sisters, A and B, play the piano every day. During the day, they can play in any order. That is, A might play first and then B, or it could be B first and then A. But each one of them plays the piano exactly once per day. They maintain a common log, in which they write their name whenever they play.

You are given the entries of the log, but you're not sure if it has been tampered with or not. Your task is to figure out whether these entries could be valid or not.

Input
The first line of the input contains an integer 
T
T denoting the number of test cases. The description of the test cases follows.
The first line of each test case contains a string 
s
s denoting the entries of the log.
Output
For each test case, output yes or no according to the answer to the problem.
*/
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            String s = sc.next();

            boolean valid = true;

            for (int i = 0; i < s.length(); i += 2) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    valid = false;
                    break;
                }
            }

            System.out.println(valid ? "yes" : "no");
        }

        sc.close();
    }
}
