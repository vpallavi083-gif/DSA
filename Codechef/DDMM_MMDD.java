/**

DDMM or MMDD
Chef is confused by all the different formats dates can be written in. Here's a simple problem Chef wants you to solve.

You are given a date string 
S
S. The date follows the Gregorian calendar, the one used in most parts of the world.

Identify whether it is of the form DD/MM/YYYY or MM/DD/YYYY, or if it can be of both forms. Here DD denotes the 2-digit day, MM denotes the 2-digit month and YYYY denotes the 4-digit year.

It is guaranteed that 
S
S is a valid date taking at least one of these forms.

For example,

21/05/2001 is of the form DD/MM/YYYY and not MM/DD/YYYY.
10/15/2069 is of the form MM/DD/YYYY and not DD/MM/YYYY.
05/11/1999 can be of both forms.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();

            int first = Integer.parseInt(s.substring(0,2));
            int second = Integer.parseInt(s.substring(3,5));
            
            if(first >12){
                System.out.println("DD/MM/YYYY");
            }else if(second >12){
                System.out.println("MM/DD/YYYY");
            }else{
                System.out.println("Both");
            }
        }
    }
}
