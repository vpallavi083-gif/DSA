/**
CodeChef Streak
CodeChef offers a feature called streak count. A streak is maintained if you solve at least one problem daily.Om and Addy actively maintain their streaks on CodeChef. Over a span of N consecutive days, you have observed the count of problems solved by each of them.
Your task is to determine the maximum streak achieved by Om and Addy and find who had the longer maximum streak.Input Format The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of multiple lines of input.The first line of each test case contains an integer 
N — the number of days.The second line of each test case contains 
N
N space-separated integers, the 
i
t
h
i 
th
  of which is 
A
i
A 
i
​
 , representing the problems solved by Om on the 
i
t
h
i 
th
  day.
The third line of each test case contains 
N
N space-separated integers, the 

  of which is 
B
i
B 
i
​
 , representing the problems solved by Addy on the 
i
t
h
i 
th
  day.
Output Format
For each test case, output:

OM, if Om has longer maximum streak than Addy;
ADDY, if Addy has longer maximum streak than Om;
DRAW, if both have equal maximum streak.
You may print each character in uppercase or lowercase. For example, OM, om, Om, and oM, are all considered the same.

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }

            int omMax = 0, addyMax = 0;
            int omStreak = 0, addyStreak = 0;

            // Om ka maximum streak
            for (int i = 0; i < n; i++) {
                if (a[i] > 0) {
                    omStreak++;
                    if (omStreak > omMax) {
                        omMax = omStreak;
                    }
                } else {
                    omStreak = 0;
                }
            }

            // Addy ka maximum streak
            for (int i = 0; i < n; i++) {
                if (b[i] > 0) {
                    addyStreak++;
                    if (addyStreak > addyMax) {
                        addyMax = addyStreak;
                    }
                } else {
                    addyStreak = 0;
                }
            }

            if (omMax > addyMax) {
                System.out.println("OM");
            } else if (addyMax > omMax) {
                System.out.println("ADDY");
            } else {
                System.out.println("DRAW");
            }
        }

        scanner.close();
    }
}
