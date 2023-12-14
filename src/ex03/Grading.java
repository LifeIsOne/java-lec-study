package ex03;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        int grade;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the grades : ");
        grade = sc.nextInt();

        if (grade >= 90)
            System.out.println("A grade");
        else if (grade >= 80)
            System.out.println("B grade");
        else if (grade >= 70)
            System.out.println("C grade");
        else if (grade >= 60)
            System.out.println("D grade");
        else
            System.out.println("F grade");
    }
}
