/*
 _____$$$$$
 ____$$$$       Note:- ith = no. of lines
 ___$$$                 jth = no. of spaces
 __$$                   kth = no. of $'s
 _$
 _$
 __$$
 ___$$$
 ____$$$$
 _____$$$$$
 */
public class Pattern20 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) { // ith = no. of linse
            for (int j = 5; j >= i; j--) { // jth = no. of spaces
                System.out.print(" ");
            }
            for (int k = 5; k >= i; k--) { // kth = no. of $'s
                System.out.print("$");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("$");
            }
            System.out.println();
        }
    }

}
