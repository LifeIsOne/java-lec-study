package ex05;

public class PizzaNum {
    private String toppings;
    private int radius;
    static final double PI = 3.141592;
    static int count = 0;

    public PizzaNum(String toppings) {
        this.toppings = toppings;
        count ++;
    }
}
