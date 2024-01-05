package ex02;

import java.util.Scanner;

public class FtoC3 {
    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("==================================");
        System.out.println();
        System.out.print("번호를 선택하시오 : ");
        // 1. 화씨 혹은 섭씨를 선택
        Scanner sc = new Scanner(System.in);
        int selectedNum = sc.nextInt();
        // 2. 화씨 혹은 섭씨 온도받기
        System.out.print((selectedNum == 1 )? "화씨온도를 입력하시오: " : "섭씨온도를 입력하시오: ");
        double temp = sc.nextDouble();
        // 3. 화씨 혹은 섭씨 온도를 받아서 변환하기
        double result = selectedNum == 1 ? (5.0 / 9.0 * (temp - 32)) : (9.0 / 5.0 * temp + 32);
        System.out.print((selectedNum == 1 )? "섭씨온도는 " + result : "화씨온도는 " + result);

    }
}
