import java.util.Scanner;

public class Jagged1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[5][];
        arr[0] = new int[5];
        arr[1] = new int[3];
        arr[2] = new int[3];
        arr[3] = new int[4];
        arr[4] = new int[2];

        int i, j;
        for (i = 0; i <= arr.length - 1; i++) {
            for (j = 0; j <= arr[i].length - 1; j++) {
                System.out.println("Enter the Banks no." + " " + i + " " + "and the Customers" + " " + j);
                arr[i][j] = scan.nextInt();
            }
        }
        for (i = 0; i <= arr.length - 1; i++) {
            for (j = 0; j <= arr[i].length - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
