package ex03;

import java.util.Scanner;

public class GugudanEx03 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++)
                System.out.printf("%d X %d = %d\t",j, i, j * i);
            System.out.println();
        }
    }
}