package ex01;

public class VarEx01 {

    // 모든 코드는 main 메서드 내부에 적는다.
    public static void main(String[] args){
        int n1 = 1;         // int : -21 ~ 21억까지 (4Byte)
        double d1 = 1.5;    // double : 21억까지+소수 (8Byte)
        long big1 = 20000000000L;   // long : 경 까지 (8Byte), -L
        boolean b1 = true;  // boolean : true, false (1Bit)
        char c1 = 'A';      // char : 문자 하나 (2Byte)

        System.out.println(n1);
        System.out.println(d1);
        System.out.println(big1);
        System.out.println(b1);
    }   // 자바 프로그램 종료
}
