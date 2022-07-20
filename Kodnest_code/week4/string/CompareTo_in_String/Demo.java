class Demo {
    public static void main(String[] args) {
        String S1 = "Sachin";
        String S2 = "Saurav";

        if (S1.compareTo(S2) > 0) {
            System.out.println("String1 is greater");
        } else if (S1.compareTo(S2) < 0) {
            System.out.println("String2 is greater");
        } else {
            System.out.println("Both Strings are Equal");
        }
    }
}