/**
Given a list of numbers, you have to sort them in non decreasing order.

Input Format
The first line contains a single integer, 
N
N, denoting the number of integers in the list.
The next 
N
N lines contain a single integer each, denoting the elements of the list.
Output Format
Output 
N
N lines, containing one integer each, in non-decreasing order.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
