/*
_____$$$$$ 
____$$$$$       Note:- ith = no. of lines
___$$$$$                jth = no. of spaces
__$$$$$                 kth = no. of $'s
_$$$$$ 

 */
public class Pattern15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {// no. of lines
            for (int j = 5; j >= i; j--) {// no. of spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) {// no. of $'s
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
