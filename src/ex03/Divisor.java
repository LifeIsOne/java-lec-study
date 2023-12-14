package ex03;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int n = sc.nextInt();

        System.out.println("The divisor of " + n + " is");
        for (int i = 1; i <= n ; i++) {
            if (n % i == 0)
                System.out.print(i + " " );
        }
    }
}
