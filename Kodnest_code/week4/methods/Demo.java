// COMPARETO() AND OTHER INBUILD METHODS IN STRING CLASS

class Demo {
    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "Saurav";

        if (s1.compareTo(s2) > 0) {
            System.out.println("String 1 is greater");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("String 2 is greater");
        } else {
            System.out.println("Both strings are Equal");
        }
    }
}
