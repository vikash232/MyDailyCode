/*
Remove Code Redundany from this 2d arrays

 Colleges   Students
 0          0 1 2
 1          0 1 2
 2          0 1 2
 3          0 1 2
 4          0 1 2
 */

import java.util.Scanner;

class Jagged1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        /*
         * Code Redundancy
         * System.out.print("Enter 1st Dimension length");
         * int a = scan.nextInt();
         * System.out.print("Enter 2nd Dimension length");
         * int b = scan.nextInt();
         * int arr[][] = new int[a][b];
         * 
         */

        // We can eliminate usage of variable a & b, & can get same output

        System.out.println("Enter 1st & 2nd Dimension length");
        int[][] arr = new int[scan.nextInt()][scan.nextInt()];

        // We can remove teh code redundancy by writing the code as shown above.

        System.out.print("Enter the Marks");

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.println("Enter the marks of college " + i + " Student " + j);
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.print("Array Contents are");
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }
}