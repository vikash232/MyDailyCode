// Methods that would take the parameter and would return the value
class Demo {
    int add(int a, int b) {
        int c = a + b;
        return c;
    }
}

public class DemoApp {
    public static void main(String[] args) {
        Demo m = new Demo();
        int x = 40;
        int y = 20;

        int res = m.add(x, y);
        System.out.println(res);
    }
}
