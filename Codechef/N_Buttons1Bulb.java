/**
Kulyash stays in room that has a single bulb and N buttons. The bulb is initially on.The initial states of the buttons are stored in a binary string S of length N — if 

​
  is 
0
0, the 
i
i-th button is off, and if 
S
i
S 
i
​
  is 
1
1, the 
i
i-th button is on. If Kulyash toggles any single button then the state of the bulb reverses i.e. the bulb lights up if it was off and vice versa.

Kulyash has toggled some buttons and the final states of the buttons are stored in another binary string 
R
R of length 
N
N. He asks you to determine the final state of the bulb.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of three lines of input.
The first line of each test case contains an integer 
N
N — the number of buttons.
The second line of each test case contains a binary string 
S
S — the initial states of the buttons.
The third line of each test case contains a binary string 
R
R — the final states of the buttons.
Output Format
For each test case, output on a new line the final state of the bulb (
0
0 for off and 
1
1 for on).

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
N
≤
100
1≤N≤100
S
S and 
R
R are binary strings, i.e, contain only the characters 
0
0 and 
1
1.

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            String r = scanner.next();

            int count = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != r.charAt(i)) {
                    count++;
                }
            }

            if (count % 2 == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        scanner.close();
    }
}
