import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter marks of student" + i);
            arr[i] = scan.nextInt();
        }

        /*
         * In above line I have added (arr.length-1) that mean it will
         * run at this much time only
         */
        System.out.println("Array Contexts are");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
