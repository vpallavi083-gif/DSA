/**
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]

*/
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        long c = 1;
        for (int i = 0; i <= rowIndex; i++) {
            row.add((int) c);
            c = c * (rowIndex - i) / (i + 1);
        }

        return row;
    }
}
