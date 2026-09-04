/**
Chef is given a string 
S
S consisting only of the characters ( and ). Chef wants to make this parentheses string valid by performing the minimum number of insertions.

A parentheses string is considered valid if and only if one of the following conditions holds:

It is an empty string, or
It can be written as 
A
B
AB, where both 
A
A and 
B
B are valid parentheses strings, or
It can be written as 
(
A
)
(A), where 
A
A is a valid parentheses string.
In one move, Chef is allowed to insert one parenthesis, either ( or ), at any position in the string.

Chef wants to know the minimum number of insertions required to make the given string valid.

Your task is to help Chef compute this minimum number for each test case.
*/
public static int minAddToMakeValidNaive(String s) {
    int open = 0;
    int ans = 0;

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(') {
            open++;
        } else {
            if (open > 0) {
                open--;
            } else {
                ans++;
            }
        }
    }

    return ans + open;
}
