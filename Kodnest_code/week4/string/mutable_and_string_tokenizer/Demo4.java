import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = scan.nextLine();

        char cha[] = str.toCharArray();
        for (int i = 0; i <= cha.length - 1; i++) {
            System.out.println(cha[i] + " ");
        }
    }
}
