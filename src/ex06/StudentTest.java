package ex06;

class Person{
    private String regnumer;        // 자식 클래스에서 접근 불가
    private double weight;
    protected int age;              // 접근 가능
    String name;                    // 어디에서나 접근 가능
    // Alt + insert -> getter / setter -> weight
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Student extends Person {
    int id;
}

public class StudentTest {
    public static void main(String[] args) {
        Student obj = new Student();
//        obj.regnumer = "123456";          // 오류 발생!! 올우ㅏㅂ라생!!
//        obj.weight = 75.0;
        obj.age = 21;
        obj.name = "Kim";
        obj.setWeight(75.0);
    }
}
