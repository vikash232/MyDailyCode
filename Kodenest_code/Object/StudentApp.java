class student {
    String name;
    int age;
    String gender;
    int usn;

    void eat() {
        System.out.println("student is eating");
    }

    void sleep() {
        System.out.println("student is sleeping");
    }

    void study() {
        System.out.println("student is studying");
    }
}

class studentApp {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();
        s1.eat();
        s2.sleep();
        s3.study();
        // new.student().study();
    }
}