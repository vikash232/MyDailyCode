// Methods that would accept the parameters but would not return any value
class Demo {
    // void add(int a, int b) {
    // int c = a + b;
    // System.out.println(c);
    int add(int a, int b) {
        int c = a + b;
        return c;
    }
}

public class DemoApp {
    public static void main(String[] args) {
        Demo m = new Demo();
        int x = 60;
        int y = 10;
        int res = m.add(x, y);
        System.out.println(res);
    }
}