package ex06;

class Animal{
    void speak(){
        System.out.println("멍멍");
    }
    void run(){
        System.out.println("(달린다)");
    }
}

class Cat extends Animal{
// Ctrl + Spacebar -> 재정의
    void speak() {
        System.out.println("야옹");
    }
}

public class AnimalEx01 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.speak();
        c.run();
    }
}
