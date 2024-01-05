package ex05;

public class PizzaNumTest {
    public static void main(String[] args) {
        PizzaNum p1 = new PizzaNum("Super Supreme");
        PizzaNum p2 = new PizzaNum("Cheese");
        PizzaNum p3 = new PizzaNum("Pepperoni");
        int n = PizzaNum.count;
        System.out.println("지금까지 판매된 피자 개수 : " + n);
    }
}
