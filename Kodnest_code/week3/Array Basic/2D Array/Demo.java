
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[4][3];

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.println("Enter the Salary of Company" + " " + i + " and Employee" + " " + j);
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Array Contents are...");

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
