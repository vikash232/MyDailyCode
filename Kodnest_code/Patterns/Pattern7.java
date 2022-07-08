/*
 $$$$$ <--1st line
 $$$$$
 $$$$$          ith loop - Takes care of no.of lines
 $$$$$          jth loop - Takes care of no. of $'s
 $$$$$ <--5th line

 */

public class Pattern7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
