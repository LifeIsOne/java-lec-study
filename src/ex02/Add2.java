package ex02;

import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // heap에 할당
        int x, y, sum;

        System.out.print("Enter the first number : ");
        x = sc.nextInt();

        System.out.print("Enter the second number : ");
        y = sc.nextInt();

        sum = x + y;
        System.out.println(sum);
    }
}
