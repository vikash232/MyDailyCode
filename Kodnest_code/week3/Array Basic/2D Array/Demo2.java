import java.util.Scanner;

// Removing code Rudundancy in 2Jagged Array
/* Problem Statement 
College         Students
0               0  1 2
1               0  1 2
2               0  1 2
3               0  1 2
4               0  1 2
*/
public class Demo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st Dimension length");
        int a = scan.nextInt();
        System.out.println("Enter 2nd Dimension length");
        int b = scan.nextInt();
        int arr[][] = new int[a][b];
        System.out.println("Enter the marks");

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.println("Enter the marks of college" + i + "student" + j);
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Array Contents are: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
