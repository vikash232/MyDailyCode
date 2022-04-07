/* An abstract method belongs to an "abstract" class, and it does not 
  have a body. The body is provided by the subclass */

// Code from filename: Main.java
// abstract class
abstract class Main {
    public String fname = "John";
    public int age = 24;

    public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends Main {
    public int graduationYear = 2018;

    public void study() { // hte body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
// End code from filename: Main.java

// Code from filename: Second.java
class Second {
    public static void main(String[] args) {
        // create an object of the student class (which inherits attributes and methods
        // form Main )
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // call abstract method
    }
}