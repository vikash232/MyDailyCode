/*
 _____$$$$$  Note: ith = no. of lines
 ____$$$$           jth = no. of spaces
 ___$$$             kth = no. of $'s
 __$$
 _$
 */
public class Pattern18 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
