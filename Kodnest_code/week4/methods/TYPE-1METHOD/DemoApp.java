// Methods that would not take any input and would not give any output

class Demo {
    void add() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }
}

class DemoApp {
    public static void main(String[] args) {
        Demo m = new Demo();
        m.add();

    }
}