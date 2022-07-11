/*
 _$$$$$$$$$
 __$$$$$$$  Note:- ith = no. of lines
 ___$$$$$           jth = no. of spaces 
 ____$$$            kth = no. of $'s
 _____$
 */

public class Pattern22 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {// ith = no. of lines
            for (int j = 1; j <= i; j++) {// jth = no. of spaces
                System.out.print(" ");
            }
            for (int k = 9; k >= 2 * i - 1; k--) {// kth = no. of $'s
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
