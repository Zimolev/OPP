package org.example.SeminarOne.SeminarWork;

public class Main {
    public static void main(String[] args) {
        CreditAccount creditAccount = new CreditAccount(123, "Oleg", 200000.0, 10.0);
        DepositAccount depositAccount = new DepositAccount(123, "Oleg", 20000.0, 5.0);
        System.out.println("creditAccount.getBalance() = " + creditAccount.getBalance());
        creditAccount.calculateInterest();
        System.out.println("creditAccount.getBalance() = " + creditAccount.getBalance());
        depositAccount.addInterest();
        System.out.println("depositAccount.getBalance() = " + depositAccount.getBalance());

    }
}

