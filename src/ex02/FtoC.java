package ex02;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        byte select;
        double F = 0;
        double C = 0;

        System.out.println("==================================");
        System.out.println("1. ℉ -> ℃");
        System.out.println("2. ℃ -> ℉");
        System.out.println("==================================");
        System.out.println();
        System.out.print("Select a number (1 or 2) : ");

        Scanner sc = new Scanner(System.in);
        select = sc.nextByte();

        if (select == 1) {
            System.out.print("Enter the ℉ : ");
            F = sc.nextDouble();
            C = (F - 32) * 5 / 9;
            System.out.println("℃ = " + C);
        } else if (select == 2) {
            System.out.print("Enter the ℃ : ");
            C = sc.nextDouble();
            F = C / 5 * 9 + 32;
            System.out.println("℉ = " + F);
        }
    }
}
