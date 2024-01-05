package ex03;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오 : ");

        int number = sc.nextInt();

        if (number > 0)
            System.out.println("양수 입니다.");
        else if (number < 0)
            System.out.println("음수 입니다.");
        else
            System.out.println("0 입니다.");
    }
}
