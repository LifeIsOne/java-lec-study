package ex02;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        String  name;
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name : ");
        name = sc.nextLine();                   // 한줄 전체

        System.out.print("Enter the age : ");
        age = sc.nextInt();

        System.out.println("Hello " + name + ". ur age is " + (age));
    }
}
