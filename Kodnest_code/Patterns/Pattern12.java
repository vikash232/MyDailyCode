/*
 * * * * * $         ith = no. of lines
 * * * * * $ $       jth = no. of *'s
 * * * * * $ $ $     kth = no. of $'s
 * * * * * $ $ $ $
 * * * * * $ $ $ $ $
 */

public class Pattern12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // no. of lines
            for (int j = 1; j <= 5; j++) { // no. of *'s
                System.out.print("*");
            }
            for (int k = 1; k <= i; k++) { // no. of $'s
                System.out.print("$");
            }
            System.out.println();
        }
    }

}
