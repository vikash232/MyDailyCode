import java.util.Scanner;

// Write a java program to take 5 students marks as input from the keyboard and store it in an array.

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i <= 4; i++) {
            System.out.println("Enter marks of student" + i);
            arr[i] = scan.nextInt();
        }

        System.out.println("Array Contents are");
        for (int i = 0; i <= 4; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
