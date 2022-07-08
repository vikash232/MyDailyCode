/*
 $ $ $ $ $
 $ $ $ $        Note:- ith = no. of lines
 $ $ $                  jth = no. of $'s
 $ $ 
 $ 
 */

public class Pattern13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // no. of lines
            for (int j = 5; j >= i; j--) { // for print the $'s in descending order.
                System.out.print("$");
            }
            System.out.println();

        }
    }
}
