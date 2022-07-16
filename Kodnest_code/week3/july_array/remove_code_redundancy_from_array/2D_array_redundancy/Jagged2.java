
/*

Remove Code Redundany from this 2d arrays

 Scenario:-
  Colleges      Students
 0          0 1 2 3
 1          0 1 2
 2          0 1 
 3          0 1 2 3 4

 Note1: Take both the dimension lenghts as input from the user to create an array.

 Note2: The marks also should be taken as input from the user to store the contents into the array.
 */
import java.util.*;

public class Jagged2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st Dimension length");
        int len1 = scan.nextInt();
        int[][] arr1 = new int[len1][];

        // Code Redundancy
        // for (int i = 0; i <= arr1.length - 1; i++) {
        // System.out.println("Enter the 2nd dimension length of 1st Dimension" + i);
        // int len2 = scan.nextInt();
        // arr1[i] = new int[len2];
        // }

        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.println("Enter the 2nd dimension length of 1st Dimension" + i);
            arr1[i] = new int[scan.nextInt()];
        }
        for (int i = 0; i <= arr1.length - 1; i++) {
            for (int j = 0; j <= arr1[i].length - 1; j++) {
                System.out.println("Enter the marks of college " + i + " and student " + j);
                arr1[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i <= arr1.length - 1; i++) {
            for (int j = 0; j <= arr1[i].length - 1; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }

}
