package ex04.example;

import ex04.example.model.Account;
import ex04.example.model.User;

public class BankApp {
    public static void main(String[] args) {
        // 1. 고객 2명 만들기
        User u1 = new User(1, "KennethMinsu","Kim@psick.com");
        User u2 = new User(2, "DannyYongju","Lee@psick.com");
        User u3 = new User(3, "Jaehyung","Jeong@psick.com");
        // 2. 계좌 2개 만들기
        Account KimAccount = new Account(1111, 10000L, 1);
        Account LeeAccount = new Account(2222, 1500L, 2);
        Account JeongAccount = new Account(3333, 1000L, 3);
        // 3. 고객에게 정보를 받기
        long amount = 1000L;
//        int sender = 1111;
//        int receiver = 2222;
        // 4. 이체
        BankService.이체(KimAccount, LeeAccount, amount);
        // 5. 이체
        BankService.이체(LeeAccount, JeongAccount, amount);
        // 6. dlcp
        BankService.이체(LeeAccount, JeongAccount, amount);
        // 7. 객체 상태 확인
        System.out.println(KimAccount);
        System.out.println(LeeAccount);
        System.out.println(JeongAccount);
        // 8. 출금
        BankService.출금(KimAccount, amount);
        BankService.출금(LeeAccount, amount);
    }
}
