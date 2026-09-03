/**
Chef is playing with a string s that contains digits, arithmetic operators, and parentheses. He wants to find the maximum nesting depth of parentheses in the string.

The nesting depth is the maximum number of parentheses that are open at the same time. Chef wants you to help him calculate this value.
Function Declaration
Function Name:maxNestingDepth
Parameters:s (string) A string that may contain digits, arithmetic operators +, -, *, /, and parentheses (, ).
Return Value:
Returns an int representing the maximum nesting depth of parentheses in the string.
Constraints
1≤T≤100
1≤∣s∣≤100 s consists of digits 0–9, arithmetic operators +, -, *, /, and parentheses (, )s is guaranteed to be a valid parentheses string (VPS)
*/

private static int maxNestingDepth(String s) {

    int depth = 0;
    int maxDepth = 0;

    for (int i = 0; i < s.length(); i++) {

        if (s.charAt(i) == '(') {
            depth++;
            maxDepth = Math.max(maxDepth, depth);
        } 
        else if (s.charAt(i) == ')') {
            depth--;
        }
    }

    return maxDepth;
}
