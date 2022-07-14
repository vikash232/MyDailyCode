/* 
Problem Statement

College     Students
0           0 1
1           0 1 2 3          no. of columns:- ith(4)
2           0 1 2            no. of rows:- not sure it's vary
3           0 1 2 3 
*/

import java.util.*;

public class Jagged1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[4][];
        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[3];
        arr[3] = new int[4];

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                System.out.println("Enter the marks of college " + i + " and student " + j);
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Array Contents are..");
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
