// Note:- If the programmer has not written
//     any constructor in the class than by default
//     one zero-paramaeterized constructor
//     would be kept by the compiler as shown below;

class Employee1 {
    // super();
    private int empid;
    private String name;
    private int salary;

    public int getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

class EmployeeApp {
    public static void main(String[] args) {
        Employee1 e = new Employee1();
        System.out.println(e.getEmpid());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}