/**
Chef has binary string 
A
A of length 
N
N. He constructs a new binary string 
B
B by concatenating 
M
M copies of 
A
A together. For example, if 
A
=
"10010"
A="10010", 
M
=
3
M=3, then 
B
=
"100101001010010"
B="100101001010010".

Chef calls an index 
i
i 
(
1
≤
i
≤
N
⋅
M
)
(1≤i≤N⋅M) good if:

p
r
e
f
i
=
s
u
f
i
+
1
pref 
i
​
 =suf 
i+1
​
 .
Here, 
p
r
e
f
j
=
B
1
+
B
2
+
…
+
B
j
pref 
j
​
 =B 
1
​
 +B 
2
​
 +…+B 
j
​
  and 
s
u
f
j
=
B
j
+
B
j
+
1
+
…
+
B
N
⋅
M
suf 
j
​
 =B 
j
​
 +B 
j+1
​
 +…+B 
N⋅M
​
  (Note that 
s
u
f
N
⋅
M
+
1
=
0
suf 
N⋅M+1
​
 =0 by definition)

Chef wants to find the number of good indices in 
B
B. Can you help him do so?

Input Format
The first line contains a single integer 
T
T — the number of test cases. Then the test cases follow.
The first line of each test case contains two space-separated integers 
N
N and 
M
M — the length of the binary string 
A
A and the number of times 
A
A is concatenated to form 
B
B.
The second line of each test case contains a binary string 
A
A of length 
N
N containing 
0
0s and 
1
1s only.

*/


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            int N = sc.nextInt();
            long M = sc.nextLong();
            String A = sc.next();

            int count = 0;
            for (int i = 0; i < N; i++)
            {
                if (A.charAt(i) == '1')
                    count++;
            }

            if (count == 0)
            {
                System.out.println((long) N * M);
                continue;
            }

            long total = (long) count * M;
            
            if (total % 2 != 0)
            {
                System.out.println(0);
                continue;
            }

            long target = total / 2;
            long ans = 0;
            int pref = 0;

            for (int i = 0; i < N; i++)
            {
                if (A.charAt(i) == '1')
                    pref++;

                long need = target - pref;

                if (need >= 0 && need % count == 0)
                {
                    long k = need / count;

                    if (k >= 0 && k < M)
                        ans++;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
