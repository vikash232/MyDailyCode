/*
 
_ $ $ $ $ $             Note:- ith = no. of lines
_ _ $ $ $ $ $                   jth = no. of space
_ _ _ $ $ $ $ $                   kth = no. of $'s
_ _ _ _ $ $ $ $ $
_ _ _ _ _ $ $ $ $ $

 */

public class Pattern14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {// no. of lines
            for (int j = 1; j <= i; j++) {// no. of space
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) {// no. of $'s
                System.out.print("$");
            }
            System.out.println();
        }

    }

}
