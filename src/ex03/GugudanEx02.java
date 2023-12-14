package ex03;

import java.util.Scanner;

public class GugudanEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num = sc.nextInt();

        for (int i = 1; i <= 9; i++)
            System.out.printf("%d X %d = %d\n",num, i, num * i);
    }
}
