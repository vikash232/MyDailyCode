import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[][][] = new int[3][2][4];
        int i, j, k;

        for (i = 0; i <= arr.length - 1; i++) {
            for (j = 0; j <= arr[i].length - 1; j++) {
                for (k = 0; k <= arr[i][j].length - 1; k++) {
                    System.out.println(
                            "Enter the amount of bank" + " " + i + " Branch" + " " + j + " " + "Customers" + " " + k);
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }
        System.out.println("Array Contents are...");
        for (i = 0; i <= arr.length - 1; i++) {
            for (j = 0; j <= arr[i].length - 1; j++) {
                for (k = 0; k <= arr[i][j].length - 1; k++) {
                    System.out.println(arr[i][j][k] + " ");
                }
                System.out.println();
            }

        }
    }
}
