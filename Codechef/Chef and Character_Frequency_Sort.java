/**
Chef and Character Frequency Sort
Chef is experimenting with strings. He wants to rearrange all the characters of a given string 
S
S in decreasing order of their frequency.

If two characters have the same frequency, Chef sorts them in lexicographical (ASCII) order.

Help Chef by printing the final rearranged string.

Function Declaration
Function Name: sortByFrequency
Parameters:
(string)
A string consisting of uppercase and lowercase English letters and digits.
Return Value:

Returns a 

string representing the rearranged string after sorting by the given rules.
Input Format
The first and only line contains a string S.
The string consists of uppercase and lowercase English letters and digits.
Output Format
Print the rearranged string after sorting by the given rules.
*/
public static String sortByFrequency(String s) {

    int[] freq = new int[256];

    for (char ch : s.toCharArray()) {
        freq[ch]++;
    }
    Character[] chars = new Character[256];
    int n = 0;

    for (int i = 0; i < 256; i++) {
        if (freq[i] > 0) {
            chars[n++] = (char) i;
        }
    }

    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {

            if (freq[chars[i]] < freq[chars[j]] ||
                (freq[chars[i]] == freq[chars[j]]
                 && chars[i] > chars[j])) {

                Character temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
        }
    }

    StringBuilder ans = new StringBuilder();

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < freq[chars[i]]; j++) {
            ans.append(chars[i]);
        }
    }

    return ans.toString();
}
