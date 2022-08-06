/* 
Problem Statement

College     Students
0           0 1 2 3         No. of rows:- 4
1           0 1 2           No. of columns :- unknown
2           0 1 
3           0 1 2 3 4

Note1:- Take both the dimension lengths as input from the user
to create an array.

Note:- The marks also should be taken as input from the user to store
the contents into the array.
*/

public class Jagged2 {
    public static void main{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st Dimension length");
        int len1 = scan.nextInt();
        int[][] arr1 = new int[len1][];



        for(int i=0;i<=arr1.length-1;i++){
            System.out.println("Enter the 2nd dimension length of 1st dimension" +i);
            arr1[i] = new int[scan.nextInt()];
        } 
        for(int i=0; i<=arr1.length-1;i++){
            for (int j=0; j<=arr1[i].length-1;j++){
                System.out.println("Enter the marks of college" + i + "and student" + j);
                arr1[i][j]=scan.nextInt();
            }
        }
        for (int )
     
    }

}
