/**
The World Chess Championship 
2022
2022 is about to start. 
14
14 Classical games will be played between Chef and Carlsen in the championship, where each game has one of three outcomes — it can be won by Carlsen, won by Chef, or it can be a draw. The winner of a game gets 
2
2 points, and the loser gets 
0
0 points. If it’s a draw, both players get 
1
1 point each.

The total prize pool of the championship is 
100
⋅
X
100⋅X. At end of the 
14
14 Classical games, if one player has strictly more points than the other, he is declared the champion and gets 
60
⋅
X
60⋅X as his prize money, and the loser gets 
40
⋅
X
40⋅X.

If the total points are tied, then the defending champion Carlsen is declared the winner. However, if this happens, the winner gets only 
55
⋅
X
55⋅X, and the loser gets 
45
⋅
X
45⋅X.

Given the results of all the 
14
14 games, output the prize money that Carlsen receives.

The results are given as a string of length 
14
14 consisting of the characters C, N, and D.

C denotes a victory by Carlsen.
N denotes a victory by Chef.
D denotes a draw.

*/


import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            String S = sc.next();

            int carlsen = 0;
            int chef = 0;

            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);

                if (ch == 'C') {
                    carlsen += 2;
                } 
                else if (ch == 'N') {
                    chef += 2;
                } 
                else { // D
                    carlsen += 1;
                    chef += 1;
                }
            }

            if (carlsen > chef) {
                System.out.println(60 * X);
            } 
            else if (carlsen < chef) {
                System.out.println(40 * X);
            } 
            else {
                System.out.println(55 * X);
            }
        }

        sc.close();
    }
}
