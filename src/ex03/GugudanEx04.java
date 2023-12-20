package ex03;

class GugudanUtil {
    static void gugudan(int x){     // 매개변수 x 는 (stack)
        for (int i = 1; i <= 9; i++)
            System.out.println(x + "*" + i + "=" + (x * i));
        System.out.println();
    }
}

public class GugudanEx04 {
    public static void main(String[] args) {
        /**
         *  구구단을 출력
         *  GugudanUtil 클래스에 gugudan 정적 메서드를 호출하시오.
         *  parameter는 int 타입 한개가 필요합니다.
         *  ex) GugudanUtil.gugudan(5);
         */

        GugudanUtil.gugudan(1002003);
    }
}
