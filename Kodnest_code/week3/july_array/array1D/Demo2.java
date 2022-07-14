
/*
Print the employees salary
  * scenario 1:         Employees
  * 0
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 */

import java.util.Scanner;

public class Demo2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[7];
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter the Salary of employee " + i);
            arr[i] = scan.nextInt();
        }
        System.out.println("Arrays Contents are:- ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
