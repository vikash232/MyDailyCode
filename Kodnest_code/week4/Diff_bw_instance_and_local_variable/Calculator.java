class Calculator {
    // Instance Variables
    int a = 10;
    int b = 20;

    void add() {
        // Local Variables
        int x = 30;
        int y = 40;
        int z = a + b + x + y;
        System.out.println(z);
    }
}

class CalculatorApp {
    public static void main(String[] args) {
        Calculator Calci = new Calculator();
        Calci.add();
    }
}