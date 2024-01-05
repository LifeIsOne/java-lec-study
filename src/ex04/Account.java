package ex04;

public class Account {
    // private로 선언되어 클래스 내부에서만 사용가능
    private int regNumber;
    private String name;
    private int balance;
    // 접근자와 설정자 사용
    public String getName() {               return name;            }
    public void setName(String name) {      this.name = name;       }
    public int getBalance() {               return balance;         }
    public void setBalance(int balance) {   this. balance = balance;}
}
