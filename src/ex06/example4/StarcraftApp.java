package ex06.example4;

public class StarcraftApp {
    public static void gameStart(Protoss u1, Protoss u2){
        u1.attack();
        u2.attack();
        System.out.println();
    }

    public static void main(String[] args) {
        Protoss d1 = new Dragoon("d1"); // [Dragon, Protoss]
        Protoss z1 = new Zealot("z1");   // [Zealot, Protoss]
        Protoss r2 = new River("r2");     // [River, Protoss]
        Protoss dk1 = new Dark("dk1");     // [Dark, Protoss]

        gameStart(d1, z1);
        gameStart(dk1, d1);
    }
}
