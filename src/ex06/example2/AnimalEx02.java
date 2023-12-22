package ex06.example2;

class Animal{
    void speak(){
        System.out.println("멍멍");
    }
    void run(){
        System.out.println("(달린다)");
    }
}

class Cat extends Animal{
// 재정의 (Ctrl + Spacebar )
    void speak() {
        System.out.println("야옹");
    }
}

public class AnimalEx02 {
    public static void main(String[] args) {
        Cat c = new Cat();      // 다형성 : [Cat, Animal] 둘 중 선택 가능
        Animal a = new Cat();
        // Cat c2 = new Animal(); 는 불가

        c.speak();
        c.run();
    }
}
