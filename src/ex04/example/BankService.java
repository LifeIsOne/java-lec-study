package ex04.example;

import ex04.example.model.Account;

// 트랜잭션 관리
public class BankService {
    // 출금 트랜잭션
    public static void 출금(Account withdrawAccount, long amount) {
        if (amount <= 0){
            System.out.println("0원 이하의 금액은 출금할 수 없습니다. 바보야.");
            return;
        }
        if (withdrawAccount.잔액부족(amount)) {
            System.out.println("잔액이 부족해요...");
            return;
        }
        withdrawAccount.출금(amount);
    }

    // 이체 트랜잭션
    public static void 이체(Account senderAccount, Account receiverAccount, long amount){
        if (amount <= 0){
            System.out.println("0원 이하의 금액은 이체할 수 없습니다. 바보야.");
            return;
        }

        if (senderAccount.잔액부족(amount)){
            System.out.println("잔액이 부족해요...");
            return;
        }

        senderAccount.출금(amount);
        receiverAccount.입금(amount);
    }
}
