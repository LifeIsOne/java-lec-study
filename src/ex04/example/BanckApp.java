package ex04.example;

import ex04.example.model.Account;
import ex04.example.model.User;

public class BanckApp {
    public static void main(String[] args) {
        // 1. 고객 2명 만들기
        User u1 = new User(1, "KennethMinsu","Kim@psick.com");
        User u2 = new User(2, "DannyYongju","lee@psick.com");
        User u3 = new User(3, "Jaehyung","Jeong@psick.com");
        // 2. 계좌 2개 만들기
        Account a1 = new Account(1111, 10000L, 1);
        Account a2 = new Account(2222, 1000L, 2);
        Account a3 = new Account(2222, 1000L, 3);
        // 3. 고객에게 정보를 받기
        long amount = 0L;
//        int sender = 1111;
//        int receiver = 2222;
        // 4. 이체
        BankService.이체(a1, a2, amount);
        // 5. 이체
        BankService.이체(a2, a3, amount);
    }
}
