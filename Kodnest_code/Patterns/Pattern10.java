/*
 _____$$$$$         Note:- no. of lines---> ith
 _____$$$$$                 no. of spaces---> kth
 _____$$$$$                 no. of $'s  ---> jth
 _____$$$$$
 _____$$$$$
 */

public class Pattern10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // no. of lines
            for (int k = 1; k <= 5; k++) { // no. of spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) { // no. of $'s
                System.out.print("$");
            }
            System.out.println();
        }
    }

}
