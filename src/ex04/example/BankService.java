package ex04.example;

import ex04.example.model.Account;

// 트랜잭션 관리
public class BankService {
    // 이체 트랜잭션
    public static void 이체(Account senderAccount, Account receiverAccount, long amount){
        if (amount <= 0){
            System.out.println("0원 이하의 금액은 이체할 수 없습니다. 바보야.");
            return;
        }
        senderAccount.출금(amount);
        receiverAccount.입금(amount);
    }
}
