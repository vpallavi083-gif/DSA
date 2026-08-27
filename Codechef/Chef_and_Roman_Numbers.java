/**
Chef has found an ancient Roman numeral and wants to know its integer value.

Roman numerals use the following symbols:

Symbol	Value
I	1
V	5
X	10
L	50
C	100
D	500
M	1000
Normally, symbols are added from left to right.
For example:
III = 3, VIII = 8, XII = 12

However, if a smaller value comes before a larger one, it is subtracted:

I before V (5) or X (10) → 4 or 9
X before L (50) or C (100) → 40 or 90
C before D (500) or M (1000) → 400 or 900
Your task is to help Chef convert the given Roman numeral string S into its integer value.

Function Declaration
Function Name
r
o
m
a
n
T
o
I
n
t
romanToInt – This function converts a given Roman numeral string into its corresponding integer value.

Parameters
s
s : A string representing a valid Roman numeral. The string contains only the characters I, V, X, L, C, D, and M.
Return Value
Returns an integer representing the decimal (base-10) value of the given Roman numeral string.
Constraints
1
≤
∣
S
∣
≤
15
1≤∣S∣≤15
S
 contains only the characters 
I
,
V
,
X
,
L
,
C
,
D
,
 and 
M
S contains only the characters I,V,X,L,C,D, and M.
It is guaranteed that 
S
 is valid and represents a number between 
1
 and 
3999
It is guaranteed that S is valid and represents a number between 1 and 3999.
Input Format
The input consists of a single line containing a string S, which represents a Roman numeral.
Output Format
Print a single integer — the decimal value of the Roman numeral.
*/
public static int romanToInt(String s) {
    int ans = 0;

    for (int i = 0; i < s.length(); i++) {
        int curr = 0;

        switch (s.charAt(i)) {
            case 'I': curr = 1; break;
            case 'V': curr = 5; break;
            case 'X': curr = 10; break;
            case 'L': curr = 50; break;
            case 'C': curr = 100; break;
            case 'D': curr = 500; break;
            case 'M': curr = 1000; break;
        }

        if (i + 1 < s.length()) {
            int next = 0;

            switch (s.charAt(i + 1)) {
                case 'I': next = 1; break;
                case 'V': next = 5; break;
                case 'X': next = 10; break;
                case 'L': next = 50; break;
                case 'C': next = 100; break;
                case 'D': next = 500; break;
                case 'M': next = 1000; break;
            }

            if (curr < next) {
                ans -= curr;
            } else {
                ans += curr;
            }
        } else {
            ans += curr;
        }
    }

    return ans;
}
