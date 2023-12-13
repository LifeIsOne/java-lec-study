package ex04;

class  Person1{
    static int age = 20;
    static char gender = '여';
}

public class MemEx01 {  // *memory 약자
    public static void main(String[] args) {
        System.out.println(Person1.age);
        System.out.println(Person1.gender);
    }
}
