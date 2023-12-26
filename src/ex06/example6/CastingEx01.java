package ex06.example6;

class Protoss{
}

class Zealot extends Protoss{
    public void attack(){
        System.out.println("질럿이 공격.");
    }
}

class Dragoon extends Protoss{
    public void attack(){
        System.out.println("드라군 공격.");
    }
}

public class CastingEx01 {

    public static void start(Protoss p){
        // Zealot z = p -> 부모는 자식에 대입할 수 없다.
        /**
         *  run time inception ? Dragoon u1 = (Dragoon) p;
         *  u1.attack();
        */
        //Zealot u2 = (Zealot) p;
        //u2.attack();
        if (p instanceof Zealot){   // 타입검사
            Zealot u = (Zealot) p;
            u.attack();
        }
        if (p instanceof Dragoon){
            Dragoon u = (Dragoon) p;
            u.attack();
        }
    }

    public static void main(String[] args) {

        Protoss d1 = new Dragoon();
        Dragoon d2 = (Dragoon) d1;
        // Dragoon d3 = d1; -> 부모를 자식에 대입할 수 없다.


        start(new Zealot());
        start(new Dragoon());
    }
}
