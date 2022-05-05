import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence\n");
        String sent = scan.nextLine();
        String strarr[] = sent.split(" ");
        String revsent = "";

        for (int i = 0; i <= strarr.length - 1; i++) {
            String word = strarr[i];
            String revword = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                revword = revword + word.charAt(j);
            }
            System.out.println(revsent);
        }
    }
}
