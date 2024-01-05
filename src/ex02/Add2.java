package ex02;

import java.util.Scanner;   // 입력하지 않아도 main에 Scanner를 입력하면 스니펫

public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, sum;

        System.out.print("Enter the first number : ");
        x = sc.nextInt();

        System.out.print("Enter the second number : ");
        y = sc.nextInt();

        sum = x + y;
        System.out.println(sum);
    }
}
