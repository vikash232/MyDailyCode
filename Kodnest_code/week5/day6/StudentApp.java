// Note:- 1.The default constructor or zero parameterized
//     constructor would be kept by the comiler in the class
//     if and only if there is no constructor written in the
// //     class.
// 2. The default constructor would be kept in the class
// if and only if there is no constructor written in the
// class by programmer.

class Student {
    private String name;
    private int age;
    private int usn;

    public Student(String name, int age, int usn) {
        this.name = name;
        this.age = age;
        this.usn = usn;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getUser() {
        return usn;
    }
}

class StudentApp {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getUser());
    }
}