package ex06.example3;

public class StarcraftApp {
    public static void gameStart(Dragoon u1, Dragoon u2){
        u1.attack();
        u2.attack();
    }
    public static void gameStart(Dragoon u1, Zealot u2){
        u1.attack();
        u2.attack();
    }
    public static void gameStart(Dragoon u1, River u2){
        u1.attack();
        u2.attack();
    }
    public static void gameStart(Dragoon u1, Dark u2){
        u1.attack();
        u2.attack();
    }
    public static void gameStart(Zealot u1, Dragoon u2){
        u1.attack();
        u2.attack();
    }
    public static void gameStart(Zealot u1, Zealot u2){
        u1.attack();
        u2.attack();
    }
    public static void gameStart(Zealot u1, River u2){
        u1.attack();
        u2.attack();
    }
    public static void gameStart(Zealot u1, Dark u2){
        u1.attack();
        u2.attack();
    }
    public static void gameStart(River u1, Dragoon u2){
        u1.attack();
        u2.attack();
    }
    public static void gameStart(River u1, Zealot u2){
        u1.attack();
        u2.attack();
    }
    public static void gameStart(River u1, River u2){
        u1.attack();
        u2.attack();
    }
    public static void gameStart(River u1, Dark u2){
        u1.attack();
        u2.attack();
    }
    public static void gameStart(Dark u1, Dragoon u2){
        u1.attack();
        u2.attack();
    }
    public static void gameStart(Dark u1, Zealot u2){
        u1.attack();
        u2.attack();
    }
    public static void gameStart(Dark u1, River u2){
        u1.attack();
        u2.attack();
    }
    public static void gameStart(Dark u1, Dark u2){
        u1.attack();
        u2.attack();
    }


    public static void main(String[] args) {
        Dragoon d1 = new Dragoon("d1");
        Dragoon d2 = new Dragoon("d2");
        Zealot z1 = new Zealot("z1");
        Zealot z2 = new Zealot("z2");
        River r1 = new River("r1");
        River r2 = new River("r2");
        Dark dk1 = new Dark("dk1");
        Dark dk2 = new Dark("dk2");

        gameStart(d1, d2);
        gameStart(d1, z1);
        gameStart(d1, r1);
        gameStart(d1, dk1);
        gameStart(z1, d2);
        gameStart(z1, z2);
        gameStart(z1, r1);
        gameStart(z1, dk1);
        gameStart(r1, d2);
        gameStart(r1, z1);
        gameStart(r1, r2);
        gameStart(r1, dk1);
        gameStart(dk1, d2);
        gameStart(dk1, z1);
        gameStart(dk1, r1);
        gameStart(dk1, dk2);
    }
}
