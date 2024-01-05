package ex06.example4;

public class River extends Protoss{
    String name;

    public River(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println("뿌슝.                " + name);
    }
}
