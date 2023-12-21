package ex04.example.model;

public class Account {
    public final int id;   // final : 선언할 떄 반드시 초기화 돼야 함.
    public long balance;   //
    public int userId;     // 1

    public Account(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}
