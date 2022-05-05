// Methods that would not accept any parameters but would return a value

class Demo {
    int add() {
        int a = 10;
        int b = 20;
        int c = a + b;
        return c;
    }
}

public class DemoApp {

    public static void main(String[] args) {
        Demo m = new Demo();
        int res = m.add();
        System.out.println(res);
    }
}