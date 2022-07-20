class Demo {

    public static void main(String[] args) {
        String s1 = new String("omkar");
        String s2 = s1.intern(); // Copy of string create in constant pool.
        String s3 = "omkar";

        if (s2 == s3) {
            System.out.println("References are Equal");
        } else {
            System.out.println("References are unEqual");
        }
    }
}