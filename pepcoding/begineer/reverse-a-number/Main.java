// #reverse the digit

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            System.out.print(dig);
        }
    }
}
