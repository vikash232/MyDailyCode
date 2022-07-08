import javax.sound.midi.VoiceStatus;

// Here in this code we will going to understand how to use datamembers to create objects

class Student {
    // Data Members
    String name;
    int age;
    String gender;
    int usn;

    // Member Functions
    void eat() {
        System.out.println("Student is eating");
    }

    void sleep() {
        System.out.println("Student is sleeping");
    }

    void studentStudy() {
        System.out.println("Student is studying");
    }
}

class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.eat();
        s2.sleep();
        s3.studentStudy();

        s1.name = "Raju";
        s1.age = 22;
        s1.gender = "male";
        s1.usn = 123;

        s2.name = "Rajesh";
        s2.age = 21;
        s2.gender = "male";
        s2.usn = 231;

        s3.name = "Shilpa";
        s3.age = 10;
        s3.gender = "Female";
        s3.usn = 143;

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gender);
        System.out.println(s1.usn);

        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.gender);
        System.out.println(s2.usn);

        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(s3.gender);
        System.out.println(s3.usn);
    }

}