// How to take input program

import java.util.Scanner;

class Demo {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number");
        int a = scan.nextInt();
        System.out.println("enter number is: " + a);
    }
}