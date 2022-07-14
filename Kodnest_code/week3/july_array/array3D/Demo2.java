/* 
Problem statement
Collegs     Branches    Students
0           0           0 1 2 3
            1           0 1 2 3
            2           0 1 2 3
1           0           0 1 2 3     no. of columns = ith(3)
            1           0 1 2 3     no. of 2nd coloumns = jth(3)
            2           0 1 2 3     no. of rows = kth (4)
2           0           0 1 2 3
            1           0 1 2 3 
            2           0 1 2 3
*/

import java.util.Scanner;

public class Demo2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int arr[][][] = new int[3][3][4];
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                for (int k = 0; k <= arr[i][j].length - 1; k++) {
                    System.out.println("Enter the Collegs " + i + " Branches " + j + " Students " + k);
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }
        System.out.println("Arrays Contents are...");
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                for (int k = 0; k <= arr[i][j].length - 1; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }

    }
}
