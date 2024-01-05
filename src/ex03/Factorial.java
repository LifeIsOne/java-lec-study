package ex03;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long fact =1;
        int n;

        System.out.print("Enter an integer : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++)
            fact = fact * i;

        System.out.printf("%d! is %d.\n", n, fact);
        System.out.println(!true);
    }
}
