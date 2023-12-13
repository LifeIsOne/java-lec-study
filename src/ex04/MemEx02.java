package ex04;

class Person2{
    int age = 10;
    char gender = '남';
}

public class MemEx02 {
    public static void main(String[] args) {
        System.out.println("1 year later");
        System.out.println("2 years later");
        System.out.println("3 years later");

        Person2 p2 = new Person2();     // p2 변수 선언
        System.out.println(p2.age);
        System.out.println(p2.gender);

        System.out.println("메인 종료");
    }
}
