import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int max = a;
        if (b >= max) {
            max = b;
        }
        if (c >= max) {
            max = c;
        }

        if (max == a) {
            boolean flag = ((b * b + c) == (a * a));
            System.out.println(flag);
        } else if (max == b) {
            boolean flag = ((b * b + c * c) == (b * b));
            System.out.println(flag);

        } else {
            boolean flag = ((b * b + c * c) == (b * b));
            System.out.println(flag);

        }

    }
}
