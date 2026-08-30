/**
You are given a list of N strings. Your task is to find the longest common prefix shared by all the strings.
If there is no common prefix, return an empty string ("").
Function Declaration
Function Name longestCommonPrefix – This function finds the longest common prefix among a list of strings.
Parameters strs : A reference to a vector of strings containing 
N strings.Return Value Returns a string representing the longest common prefix among all given strings.
Returns an empty string ("") if no common prefix exists.
Constraints 1≤N≤200 0≤∣strs[i]∣≤200
Each string contains only lowercase English letters (a–z).
Input Format
The first line contains a single integer 
N
N, the number of strings.
The next N lines each contain one string.
Output Format
Print the longest common prefix among all strings.
If no common prefix exists, print an empty string 
"
"
"".
*/
public static String longestCommonPrefix(String[] strs) {
      if (strs.length == 0) {
        return "";
    }

    String prefix = strs[0];

    for (int i = 1; i < strs.length; i++) {
        int j = 0;

        while (j < prefix.length() &&
               j < strs[i].length() &&
               prefix.charAt(j) == strs[i].charAt(j)) {
            j++;
        }

        prefix = prefix.substring(0, j);

        if (prefix.length() == 0) {
            return "";
        }
    }

    return prefix;
}
