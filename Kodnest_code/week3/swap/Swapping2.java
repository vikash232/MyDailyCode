import java.util.Scanner;

import javafx.scene.transform.Scale;

/*
 Q. Write a java program to swap the
 contents of two indexes of an array

 arr-->10 20 30 40 50
 index->0 1  2  3  4

 help =10

 help = arr[0];
 arr[0]=arr[1];
 arr[1]=help;
 */

public class Swapping2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Contents");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("enter an element");
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter 2 indexes where the contents has to be swapped");
        int ind1 = scan.nextInt();
        int ind2 = scan.nextInt();

        System.out.println("Array Contents before swapping");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        int help;
        help = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = help;
        System.out.println("Array Contents after Swapping");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        }
    }

}
