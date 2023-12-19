package ex04.test;

public class ScopeEx01 {
    int n1 =1;              // (heap)
    static int n2 = 2;      // (static)

    static void m1() {                      // static 이친구는 메인 전에 띄어져 있음
        int n1 = 10;
        System.out.println("m1 : " + n1);
    }

    void m2 () {                            // (stack)
        System.out.println("m1 : " + n1);
    }
    // 메인 시작전에 static에 n2변수와 m1메서드가 로드되어 있음/
    public static void main(String[] args) {
        System.out.println("1");
        m1();
        System.out.println("2");
        ScopeEx01 sc = new ScopeEx01();     // (heap) static이 선언 안된 모든 데이터를 heap에 올린다.
        System.out.println(sc.n1);
        sc.m2();
    }
}
