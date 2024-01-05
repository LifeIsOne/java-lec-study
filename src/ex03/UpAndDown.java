package ex03;

import java.util.Scanner;

public class UpAndDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int user = 0;
        int random = (int)(Math.random()*100) + 1;
        int count = 0;
//        System.out.println(random);
        do {
            System.out.print("Let's guess the answer : ");
            user = sc.nextInt();

             if (random == user)
                 break;
             else if ( random > user)
                 System.out.println("UP");
             else
                 System.out.println("DOWN");

            count ++;
        }while (random != user);
        System.out.println("Congratulations. Number of attempts : " + count);
    }
}
