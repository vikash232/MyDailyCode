import java.util.StringTokenizer;

public class Demo2 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("KODNEST TECHNOLOGIES PTVT");
        while (st.hasMoreTokens() == true) {
            System.out.println(st.nextToken());
        }
    }
}
