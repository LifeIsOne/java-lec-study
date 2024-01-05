package ex03;

import java.util.Scanner;

public class RockPaperScissor {
    final int ROCK = 0;
    final int SCISSOR = 1;
    final int PAPER = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rock(0), Scissor(1), Paper(2) : ");

        int user = sc.nextInt();;


        int PC = (int) (Math.random() * 3);
        // Math.random()*3 = 0.0x ~ 2.9x / 다운 캐스팅 0-2까지 값
        System.out.println(PC);
        if (user == PC)
            System.out.println("DRAW");
        else if (user == (PC + 1) % 3)
            System.out.println("User : " + user + " Computer : " + PC + " User LOSE");
        else
            System.out.println("User : " + user + " Computer : " + PC + " User Win");
    }
}
