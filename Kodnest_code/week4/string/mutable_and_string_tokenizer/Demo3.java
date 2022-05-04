// Write a java program to replace the specified character of a string

public class Demo3 {
    public static void main(String[] args) {
        String s = "RajaRamMohanRoy";
        s = s.replace('R', 'A');
        System.out.println(s);

        // Write a java program to replace "hello" with "hai" in the given string.
        String a = "hello hello Omkar hello";
        System.out.println(a);
        a = a.replaceAll("hello", "hai");
        System.out.println(a);
    }
}
