import java.util.Scanner;

/*
 * Q. Write a java program to swap the contents of
 * two variables.
 * 
 * a=20, b=10;help=10;
 * swap to
 * help=a;
 * a=b;
 * b=help;
 * 
 */

class Swapping {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int help;
        System.out.println("enter 2 Numbers");
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println("Contents before Swapping");
        System.out.println(a + " " + b);
        help = a;
        a = b;
        b = help;
        System.out.println("Contents after Swapping");
        System.out.println(a + " " + b);

    }
}