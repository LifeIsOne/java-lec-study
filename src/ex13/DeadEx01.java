package ex13;

class Account {
    private int balance = 1000;

    public void withdraw(int amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("출급 완료 : " + amount);
        }else {
            System.out.println("잔액 부족 : " + balance);
        }
    }
}

public class DeadEx01 {
    public static void main(String[] args) {
        Account account = new Account();
        account.withdraw(1000);
        account.withdraw(1000);

    }
}