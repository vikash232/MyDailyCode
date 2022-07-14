/* 
Problem Statement

Banks       Customers
0           0 1 2 3 4
1           0 1 2       no. of columns = ith(5)
2           0 1 2
3           0 1 2 3
4           0 1
*/

import java.util.*;

public class Jagged2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[5][];
        arr[0] = new int[5];
        arr[1] = new int[3];
        arr[2] = new int[3];
        arr[3] = new int[4];
        arr[4] = new int[2];
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.println("Enter the Bank " + i + " and Enter the Customers " + j);
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Arrays contents are...");
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
