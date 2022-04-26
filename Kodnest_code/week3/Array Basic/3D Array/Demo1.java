import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[][][] = new int[3][3][4];

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                for (int k = 0; k <= arr[i][j].length - 1; k++) {
                    System.out.println(
                            "Enter the Colleges" + " " + i + " " + "Branch" + " " + j + " " + "Student" + " " + k);
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                for (int k = 0; k <= arr[i][j].length - 1; k++) {
                    System.out.println(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }

    }
}
