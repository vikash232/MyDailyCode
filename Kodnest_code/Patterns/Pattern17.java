/*
 _____$$$$$
 ____$$$$$
 ___$$$$$       Note:- ith = no. of lines
 __$$$$$               jth = no. of spaces
 _$$$$$                 kth = no. of $'s
 __$$$$$
 ___$$$$$
 ____$$$$$
 _____$$$$$
 */

public class Pattern17 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) { // no. of lines
            for (int j = 4; j >= i; j--) { // no. of spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) { // no. of $'s
                System.out.print("$");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) {
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
