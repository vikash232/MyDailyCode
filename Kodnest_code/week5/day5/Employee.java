//Commented code is not written by programmer written by compiler
// class Object {
//     public Object() {
//         // initialization code
//     }
// }

class Employee {
    // super();
    private int empid;
    private String name;
    private int salary;

    public Employee(int empid, String name, int salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

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
        Employee e = new Employee(123, "Omkar", 1000);
        System.out.println(e.getEmpid());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}