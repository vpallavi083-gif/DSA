/**
You are given two strings 
s
s and goal of equal length. Determine whether string s can be transformed into string goal by performing a series of left-shifts.

A left-shift operation moves the first character of a string to the end of the string. For example, a left-shift on "abcde" results in "bcdea".

If it is possible to transform s into 
goal using zero or more left-shifts, print "Yes".
Otherwise, print "No".
Function Declaration
Function Name canRotate – This function checks whether a string can be rotated using left-shift operations to match a target string.

Parameters s : A string representing the original string.goal : A string representing the target string after rotations.
Return Value
Returns true if string s can be transformed into string goal using zero or more left-shift operations.
Returns false otherwise. Constraints 100 1≤∣s∣=∣goal∣≤100Strings and goal consist of lowercase English letters.Input Format
The first line contains the string s.The second line contains the string goal.Output FormatPrint "Yes" if can be rotated to become goal.Print "No" otherwise.
*/
public static boolean canRotate(String s, String goal) {
    if (s.length() != goal.length()) {
        return false;
    }

    return (s + s).contains(goal);
}
