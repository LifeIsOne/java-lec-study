package ex02;

import java.util.Scanner;

public class FtoC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("섭씨온도를 입력하시오 : ");
        // 섭씨 온도 받기
        double c_temp = sc.nextDouble();
        // 섭씨 -> 화씨 변환
        double f_temp = 5.0 / 9.0 * (c_temp - 32);
        System.out.println("화씨온도는 " + f_temp);
    }
}
