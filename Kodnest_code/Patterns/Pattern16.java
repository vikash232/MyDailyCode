/*
_$$$$$
__$$$$$     Note:- ith = no. of lines
___$$$$$            jth = no. of space
____$$$$$           kth = no. of $"s
_____$$$$$
____$$$$$
___$$$$$
__$$$$$
_$$$$$
 */

public class Pattern16 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) {
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
