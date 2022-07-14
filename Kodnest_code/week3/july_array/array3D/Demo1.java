import java.util.Scanner;

/* 
Problem statement
Banks     Branches      Customers
0           0           0 1 2 3
            1           0 1 2 3

1           0           0 1 2 3
            1           0 1 2 3

2           0           0 1 2 3
            1           0 1 2 3 

*/

public class Demo1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int arr[][][] = new int[3][2][4];
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				for (int k = 0; k <= arr[i][j].length - 1; k++) {
					System.out.println("Enter the ammount of bank " + i + " Branch " + j + " Customer " + k);
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		System.out.println("Array Contents are.. ");
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
