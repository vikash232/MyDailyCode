import java.util.Scanner;

class Demo1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = scn.nextInt();
        String name = scn.nextLine();
        System.out.println("Hello" + name);
        System.out.println("Here is the counting:");
        for (int j = 0; j <= i; j++) {
            System.out.println(j);
        }
    }
}
