
public class Demo {
    public static void main(String[] args) {
        String s = "Kodnest Technologies";
        System.out.println(s); // Kodnest Technologies

        System.out.println(s.toUpperCase()); // KODNEST TECHNOLOGIES
        // converts string to upper case

        System.out.println(s.toLowerCase()); // kodnest technologies
        // converts string to lowercase

        System.out.println(s.contains("Tech")); // true
        // returns true if specified value is present in string.

        System.out.println(s.contains("Non")); // false
        // returns false, if sepcified value is not present in string.

        System.out.println(s.indexOf('d')); // 2
        // returns the index value of given character from string.

        System.out.println(s.charAt(8)); // T
        // returns the character at the given index position.

        System.out.println(s.substring(8, 11));// Tec
        // returns the substring from the starting to the ending -1 index positions from
        // string.

    }
}
