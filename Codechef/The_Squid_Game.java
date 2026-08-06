/**
"Let the games begin."

Squid Game has become a blockbuster hit and the frontman is now finding it difficult to accommodate all the participants in Squid Game 2.0. So, he decided that he will allow only those participants who could solve the following problem.

There are a total of 
N
N players who are competing in the Squid Game, numbered from 
1
1 to 
N
N. When the 
i
th
i 
th
  player gets eliminated from the game, 
A
i
A 
i
​
  amount of money is added to the prize pool. The game is played until 
N
−
1
N−1 players get eliminated, and the only player left is declared as the winner. The winner gets all the money present in the prize pool.

You are given an array 
A
A consisting of 
N
N elements, where 
A
i
A 
i
​
  denotes the prize money added to the prize pool when the 
i
th
i 
th
  player gets eliminated from the game. Find the maximum prize that the winner can get, given that you can choose any player to be the winner.

Input Format
The first line of input contains a single integer 
T
T, denoting the number of test cases. The description of 
T
T test cases follows.
The first line of each test case contains an integer 
N
N, denoting the number of players.
The second line of each test case contains 
N
N space-separated integers  denoting the amount of money added to the prize pool when the 
i
th
i 
th
  (
1
≤
i
≤
N
1≤i≤N) player dies.
Output Format
For each test case, output in a single line the maximum prize that the winner can get, given that you can choose any player to be the winner.

*/
import java.util.*;
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        while (a-- > 0) {
            int b = sc.nextInt();

            long sum = 0;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < b; i++) {
                int x = sc.nextInt();
                sum += x;
                if (x < min) {
                    min = x;
                }
            }

            System.out.println(sum - min);
        }

        sc.close();
    }
}
