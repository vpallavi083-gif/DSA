/**
Sergey has made N measurements. Now, he wants to know the average value of the measurements made.

In order to make the average value a better representative of the measurements, before calculating the average, he wants first to remove the highest K and the lowest K measurements. After that, he will calculate the average value among the remaining N - 2K measurements.

Could you help Sergey to find the average value he will get after these manipulations?

Input
The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The first line of each test case contains two space-separated integers N and K denoting the number of measurements and the number of the greatest and the lowest values that will be removed.

The second line contains N space-separated integers A1, A2, ..., AN denoting the measurements.

Output
For each test case, output a single line containing the average value after removing K lowest and K greatest measurements.

Your answer will be considered correct, in case it has absolute or relative error, not exceeding 10-6
*/


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            Arrays.sort(a);

            long sum = 0;

            for (int i = k; i < n - k; i++) {
                sum += a[i];
            }

            double average = (double) sum / (n - 2 * k);

            System.out.printf("%.6f%n", average);
        }

        scanner.close();
    }
}
