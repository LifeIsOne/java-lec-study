package ex04;

public class Account {
    private int regNumber;
    private String name;
    private int balance;    // private로 선언돼 클래스 내부에서만 사용가능
    // 접근자와 설정자 사용
    public String getName() {               return name;            }
    public void setName(String name) {      this.name = name;       }
    public int getBalance() {               return balance;         }
    public void setBalance(int balance) {   this. balance = balance;}
}
