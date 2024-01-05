package ex07.example;
//  RC : Remote Control
interface RC{    // 메서드를 강제시킬 수 있다.
    void on();

    void off();
}

class SamsungRC implements RC {

    @Override
    public void on() {
        System.out.println("삼성 리모콘 on");
    }

    @Override
    public void off() {
        System.out.println("삼성 리모콘 off");
    }
}

class LgRC implements RC {

    @Override
    public void on() {
        System.out.println("엘지 리모콘 on");

    }

    @Override
    public void off() {
        System.out.println("엘지 리모콘 off");
    }
}

/**
 *  작성자 : 홍길동
 *  작성일 : 2023.12.26
 *  구현체 : SamsungRC, LgRC
 */
class CommonRC{
    // [RC <-, SamsungRC]
    // [RC <-, LgRC]
    private RC r;

    public CommonRC(RC r) {
        this.r = r;
    }

    public void on(){
        r.on();
    }

    public void off(){
        r.off();
    }
}

public class InterEx01 {

    public static void main(String[] args) {
        RC samsung = new SamsungRC();   // [RC,SamsungRC]
        CommonRC cr = new CommonRC(new SamsungRC());
        cr.on();
    }
}