package ex06.example5;

abstract class 판사{              // 오브젝트라 부를 수 없다. 추상 class
    public abstract void 심문();  // 추상 method {} 필요없음.
}

abstract class 증인{
    public abstract void 대답();
}

class 왕 extends 판사{
    public void 심문(){
        System.out.println("왕은 심문하고,");
    }
}
class 왕비 extends 판사{
    public void 심문(){
        System.out.println("왕비는 심문하고,");
    }
}

class 모자장수 extends 증인{
    public void 대답(){
        System.out.println("모자장수는 대답한다.");
    }
}

class 토끼 extends 증인{
    public void 대답(){
        System.out.println("토끼는 대답한다.");
    }
}

class 앨리스 extends 증인{
    @Override
    public void 대답() {

    }
}

public class AliceApp {

    public static void start(){

    }

    public static void main(String[] args) {
        판사 u1 = new 왕비();   // [판사, 왕비]
        증인 u2 = new 토끼();   // [증인, 토끼]
        // 증인 u3 = new 증인(); -> abstract 했기 때문, 자식클래스를 대신 띄어야 한다.
        증인 u3 = new 앨리스();

        u1.심문();
        u2.대답();
    }
}
