/*
 _____$
 ____$$$
 ___$$$$$       Note:- ith = no. of lines
 __$$$$$$$              jth = no. of spaces
 _$$$$$$$$$             kth = no. of $'s
 _$$$$$$$$$
 __$$$$$$$
 ___$$$$$
 ____$$$
 _____$
 */

public class Pattern23 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) { // ith = no. of lines
            for (int j = 5; j >= i; j--) { // jth = no. of spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) { // kth = no. of $'s
                System.out.print("$");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 9; k >= 2 * i - 1; k--) {
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
