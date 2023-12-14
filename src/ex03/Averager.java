package ex03;

import java.util.Scanner;

public class Averager {
    public static void main(String[] args) {
        int total = 0, count = 0;
        Scanner sc = new Scanner(System.in);

        while (true){       // infinite loop
            System.out.print("Enter the score (STOP = -1): ");
            int grade = sc.nextInt();
            if (grade < 0)
                break;
            total += grade;
            count++;
        }
        System.out.println("The average is " + total / count);
    }
}
