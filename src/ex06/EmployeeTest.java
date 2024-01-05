package ex06;

class Person2{
    String name;
    public Person2(){}
    public Person2(String TheName) {
        this.name = TheName;
    }
}
class Employee extends Person2{
    String id;
    // Generate -> Override
    public Employee() {
        super();
    }
    public Employee(String Name) {
        super(Name);
    }
    // Generate -> Constructor
    public Employee(String TheName, String id) {
        super(TheName);
        this.id = id;
    }
    @Override
    public String toString() {
        return "Employee [id = " + id + " name = " + name + "]";
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee("Kim", "20210001");
        System.out.println(e);
    }
}
