import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int n = scan.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter Array Contents");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter an element");
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter 2 indexs when the Contents has to be swapped");
        int ind1 = scan.nextInt();
        int ind2 = scan.nextInt();
        System.out.println("Array Contents Before sweeping");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        int help;
        help = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = help;

        System.out.println("Array Contents after Sweeping");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}