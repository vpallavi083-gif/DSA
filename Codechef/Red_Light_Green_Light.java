/**
Red Light, Green Light
“You won’t get caught if you hide behind someone.”

Sang-Woo advises Gi-Hun to hide behind someone to avoid getting shot.

Gi-Hun follows Sang-Woo's advice and hides behind Ali, who saved his life earlier. Gi-Hun and Ali both have the same height, 
K
K. Many players saw this trick and also started hiding behind Ali.

Now, there are 
N
N players standing between Gi-Hun and Ali in a straight line, with the 
i
th
i 
th
  player having height 
H
i
H 
i
​
 . Gi-Hun wants to know the minimum number of players who need to get shot so that Ali is visible in his line of sight.

Note:

Line of sight is a straight line drawn between the topmost point of two objects. Ali is visible to Gi-Hun if nobody between them crosses this line.
Even if there are some players who have the same height as that of Gi-Hun and Ali, Ali will be visible in Gi-Hun's line of sight.
Gi-Hun and Ali have the same height.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		while (a--> 0) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			int count = 0;

			for (int i = 0; i < N; i++) {
				int h = sc.nextInt();
				if (h > K) {
					count++;
				}
			}

			System.out.println(count);
		}

		sc.close();
	}
}
