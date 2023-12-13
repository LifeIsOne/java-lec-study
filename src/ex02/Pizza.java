package ex02;

public class Pizza {
    public static void main(String[] args) {
        double area1 = 2 * 3.141592 * 20 * 20;
        double area2 = 3.141592 * 30 * 30;
        System.out.println("the area of two 20cm pizzas = " + area1);
        System.out.println("the area of a 30cm pizza = " + area2);
        System.out.println("Bigger pizza is " + ((area1>area2)? "two 20cm pizzas" : "a 30cm pizza"));
    }
}
