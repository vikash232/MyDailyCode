// Fan Object Creation Example with main Method

class Fan {
    String color;
    int cost;
    String brand;

    void rotate() {
        System.out.println("Fan is rotating");
    }

    void blowAir() {
        System.out.println("Fan is blowing air");
    }
}

class FanApp {
    public static void main(String args[]) {
        Fan f1 = new Fan();
        Fan f2 = new Fan();
        Fan f3 = new Fan();
        f1.rotate();
        f2.blowAir();
        f3.blowAir();
        new Fan().rotate();
    }
}