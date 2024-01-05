package ex04;

public class MethodEx01 {
    static void  m1(){                      // void : 반환할 게 없다.
        System.out.println("m1");
    }
    static String m2(){                     // main에서 실행시키면 열린다
        System.out.println("m2");
        return "m2";                        // return - : 메서드 종료
    }
    public static void main(String[] args) {
        MethodEx01.m1();
        m1();

        m2();                               // 실행후 리턴 값인 "m2"로 바뀐다.
        String result = "m2";
        // == String result = m2();
        System.out.println("resulf : " + result);
    }
}
