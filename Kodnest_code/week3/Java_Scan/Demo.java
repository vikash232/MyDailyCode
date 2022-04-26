import java.util.Scanner;

class Demo {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scan.nextInt();
        System.out.println("Enter number is:" + a);
        System.out.println("_______________________________");
        System.out.println("Enter you height");
        float b = scan.nextFloat();
        System.out.println("Your height is:" + b);
        System.out.println("_______________________________");
        System.out.println("Are you married? Enter True or False");
        boolean c = scan.nextBoolean();
        System.out.println("Your maritial status is: " + c);
        System.out.println("_______________________________");
        System.out.println("Enter your Father name");
        String d = scan.next();
        String e = scan.next();
        System.out.println("Your Father name is: " + d + " " + e);

    }

}
