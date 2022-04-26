// Scan ( 0-5 ) Values

import java.util.*;

class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter marks of Student 0");
        arr[0] = scan.nextInt();
        System.out.println("Enter marks of Student 1");
        arr[1] = scan.nextInt();
        System.out.println("Enter marks of Student 2");
        arr[2] = scan.nextInt();
        System.out.println("Enter marks of Student 3");
        arr[3] = scan.nextInt();
        System.out.println("Enter marks of Student 4");
        arr[4] = scan.nextInt();
        System.out.println("Array Contents are");
        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        System.out.print(arr[2] + " ");
        System.out.print(arr[3] + " ");
        System.out.print(arr[4] + " ");
    }
}