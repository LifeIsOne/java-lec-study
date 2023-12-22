package ex06.example4;

public class Zealot extends Protoss {
    String name;

    public Zealot(String name) {
        this.name = name;
    }
    public void attack(){
        System.out.println("My life for Aiur.   " + name);
    }
}
