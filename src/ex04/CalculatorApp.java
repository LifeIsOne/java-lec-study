package ex04;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator cal = new Calculator();      // 동적으로 띄우기
        int resultAdd = cal.add(50, 80);          // 실행하면 리턴 값으로 바뀜
        int resultSub = cal.sub(50, 80);
        int resultMul = cal.mul(50, 80);
        int resultDiv = cal.div(50, 80);

        System.out.println(resultAdd + " " + cal.add(80, 50));
        System.out.println(resultSub + " " + cal.sub(80, 50));
        System.out.println(resultMul + " " + cal.mul(80, 50));
        System.out.println(resultDiv + " " + cal.div(80, 50));
    }
}
