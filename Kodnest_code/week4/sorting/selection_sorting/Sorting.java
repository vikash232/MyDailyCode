import java.util.Scanner;

class Sorting {
    void selectionSort(Class<arr[]> class1) {
        int min;
        int pos;
        int help;

        for (int i = 0; i <= class1.length - 2; i++) {
            min = class1[i];
            pos = i;

            for (int j = i + i; j <= class1.length - 1; j++) {
                if (class1[j] < min) {
                    min = class1[j];
                    pos = j;
                }
            }
            help = class1[i];
            class1[i] = class1[pos];
            class1[pos] = help;

        }
    }
}

class SortingApp {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array Length");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter an element");
            arr[i] = scan.nextInt();
        }
        System.out.println("Array Contents before sorting");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();

        Sorting s = new Sorting();

    s.selectionSort(arr[]);
        System.out.println("Array Contents After sorting");
        for( int i=0; i<=arr.length-1;i++);
            System.out.println(arr[i]+ " ");
    }

}}