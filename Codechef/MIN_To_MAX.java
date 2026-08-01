/**
You are given an array 
A
A of size 
N
N.

Let 
M
M be the minimum value present in the array initially.
In one operation, you can choose an element 
A
i
A 
i
​
  
(
1
≤
i
≤
N
)
(1≤i≤N) and an integer 
X
X 
(
1
≤
X
≤
100
)
(1≤X≤100), and set 
A
i
=
X
A 
i
​
 =X.

Determine the minimum number of operations required to make 
M
M the maximum value in the array 
A
A.

*/

class Solution {
    public int countNonMinimum(int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }

        int count = 0;
        for (int num : nums) {
            if (num > min) {
                count++;
            }
        }

        return count;
    }
}
