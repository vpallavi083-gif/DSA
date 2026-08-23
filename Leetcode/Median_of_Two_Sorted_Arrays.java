/**
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).
Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int n1 = nums1.length;
        int n2 = nums2.length;

        int low = 0;
        int high = n1;

        while (low <= high) {

            int i1 = (low + high) / 2;
            int i2 = (n1 + n2 + 1) / 2 - i1;

            int min1 = (i1 == n1) ? Integer.MAX_VALUE : nums1[i1];
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : nums1[i1 - 1];

            int min2 = (i2 == n2) ? Integer.MAX_VALUE : nums2[i2];
            int max2 = (i2 == 0) ? Integer.MIN_VALUE : nums2[i2 - 1];
            if (max1 <= min2 && max2 <= min1) {
                if ((n1 + n2) % 2 == 0) {
                    return ((double) Math.max(max1, max2)
                            + Math.min(min1, min2)) / 2;
                }
                else {
                    return (double) Math.max(max1, max2);
                }
            }
            else if (max1 > min2) {
                high = i1 - 1;
            }

            else {
                low = i1 + 1;
            }
        }

        return 0.0;
    }
}
