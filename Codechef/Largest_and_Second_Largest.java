/**
Largest and Second Largest
You are given an array 
A
A of 
N
N integers.
Find the maximum sum of two distinct integers in the array.

Note: It is guaranteed that there exist at least two distinct integers in the array.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains single integer 
N
N — the size of the array.
The next line contains 
N
N space-separated integers, denoting the array 
A
A.
Output Format
For each test case, output on a new line, the maximum sum of two distinct integers in the array.

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();

                if (x > largest) {
                    secondLargest = largest;
                    largest = x;
                } else if (x > secondLargest && x != largest) {
                    secondLargest = x;
                }
            }

            System.out.println(largest + secondLargest);
        }

        scanner.close();
    }
}

