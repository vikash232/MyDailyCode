/*
 * $                    Note: no. of lines --> ith
 * * $ $                      no. of *'s --> kth
 * * * $ $ $                  no. of $'s --> jth
 * * * * $ $ $ $
 * * * * * $ $ $ $ $
 */

public class Pattern11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // no. of lines
            for (int k = 1; k <= i; k++) { // no. of *'s
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) { // no. of $'s
                System.out.print("$");
            }
            System.out.println();
        }
    }

}
