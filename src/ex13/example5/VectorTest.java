package ex13.example5;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector vc = new Vector();   // 객체를 생성할 때 크기를 주지 않아도 옥헤!(줘도 된다는 거겠죠?)

        vc.add("Hellow World!");    // 문자열 단골 멘트
        vc.add(new Integer(10));
        vc.add(20);                 // 여러 타입 객체 추가

        System.out.println("벡터 크기 : " + vc.size());

        for (int i = 0; i < vc.size(); i++)
            System.out.println("벡터 요소 " + i + " : " + vc.get(i));

        String s = (String) vc.get(0);  // get()은 Object타입이라서 다운캐스팅
    }
}