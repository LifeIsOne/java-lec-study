package ex02;

import java.util.Scanner;

public class FtoC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("화씨온도를 입력하시오 : ");
        // 화씨 온도 받기
        double f_temp = sc.nextDouble();
        // 화씨 -> 섭씨 변환
        double c_temp = 9.0 / 5.0 * f_temp + 32;
        System.out.println("섭씨온도는 " + c_temp);
    }
}
