package ex04;

class Cat {
    String name;

    Cat() {                 // 기본 생성자
        this("토비");
    }
    Cat(String name){       // 생성자
        this.name = name;
    }
}

public class HeapEx01 {
    public static void main(String[] args) {
        Cat c = new Cat();      // 기본생성자 호출
    }
}
