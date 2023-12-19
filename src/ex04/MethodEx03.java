package ex04;

public class MethodEx03 {
    static void m3(int n1){
        System.out.println("m3 : " + n1);
    }
    static void m4(int n1, int n2) { // 매개 변수(parameter)가 두개
        System.out.println("m4 : " + n1);
        System.out.println("m4 : " + n2);
    }

    public static void main(String[] args) {
        m3(1);
        m4(1,2);        // 인수(Argument) 메서드의 입력 값
    }
}
