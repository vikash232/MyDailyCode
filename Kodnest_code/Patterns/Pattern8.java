/*
 $
 $$         ith--> no. of lines.
 $$$        jth--> no. of $'s.
 $$$$
 $$$$$
 */

public class Pattern8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
