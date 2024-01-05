package ex06.example7;

public class BurgerSet {    // has Burger, Coke
    // 이게 컴포지션이다!
    private Burger  burger;
    public  Coke    coke;

    public BurgerSet(Burger burger, Coke coke) {
        this.burger = burger;
        this.coke = coke;
        System.out.println("세트가 만들어졌습니다.");
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }

    public int getTotalPrice(){
        return burger.getPrice()+coke.getPrice();
    }
}
