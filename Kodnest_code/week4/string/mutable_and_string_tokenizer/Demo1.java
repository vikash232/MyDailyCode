// The capacity of StringBuffer and StringBuilder

public class Demo1 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("ViratKohli is a Batter");
        System.out.println(s.capacity());
        s.append("He plays for RCB");
        System.out.println(s.capacity());

    }
}
