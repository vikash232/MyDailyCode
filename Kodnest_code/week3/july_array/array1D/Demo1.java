/*
 * Write a Java Program to take the input from
 * the user and store the data in an array.
 * Array has to be created based on scenario's given below.
 * 1> storing 5 student Marks in any array
 * scenario 1: 0
 * 1
 * 2
 * 3
 * 4
 */

import java.util.Scanner;

class Demo1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter marks of  students:- " + i);
            arr[i] = scan.nextInt();
        }
        System.out.println("Array Contents are");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }
}