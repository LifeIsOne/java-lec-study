package ex05;
// heap으로도 static처럼 메모리에 한 번만 띄울 수 있다.
class President {

    static President instance = new President();

    public President() {

    }
}

public class SingleTonEx01 {
    public static void main(String[] args) {
        President p1 = President.instance;
        System.out.println(p1.hashCode());
    }
}
