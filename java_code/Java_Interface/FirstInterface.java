interface FirstInterface {
    public void myMethod(); // interface method (does not have a body)

}

interface SecondInterface {
    public void myOtherMethod(); // interface method (does not have a body)

}

// DemoClass "implements" the FirstInterface & SecondInterface
class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        // The body of myMethod() is provided here
        System.out.println("Some text..");
    }

    public void myOtherMethod() {
        // The body of myOtherMethod() is provided here
        System.out.println("Some other text...");
    }
}

class Main {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myMethod();
    }
}