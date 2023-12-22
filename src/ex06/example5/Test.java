package ex06.example5;

class Employee{
    public int baseSalary = 300000;
    int getSalary(){
        return baseSalary;
    }
}
class Manager extends Employee{
    @Override
    int getSalary() {
        return (baseSalary+200000);
    };
}
class Programmer extends Employee{
    @Override
    int getSalary() {
        return (baseSalary+300000);
    }
}

public class Test {
    public static void main(String[] args) {
        Manager obj1 = new Manager();
        System.out.println("관리자의 월급 : " + obj1.getSalary());

        Programmer obj2 = new Programmer();
        System.out.println("프로그래머의 월급 : " + obj2.getSalary());
    }
}
