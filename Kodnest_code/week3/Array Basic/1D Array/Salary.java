
// Examples of print the salary of 7 employees in array format
/*
  Scenario 2: Employees
    0
    1
    2
    3   "1-Dimensional Array"
    4
    5
    6
 */
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[7];

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter the Salary of employees" + " " + i);
            arr[i] = scan.nextInt();
        }
        System.out.println("Array Contents are...");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
